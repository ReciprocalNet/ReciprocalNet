/*
 * Reciprocal Net project
 * 
 * SampleIdBlock.java
 *
 * 03-Jul-2002: ekoperda wrote first draft
 * 18-Oct-2002: ekoperda fixed bug #549 in dbStore() that prevented the time
 *              portion of dates from being written to the database
 * 25-Oct-2002: ekoperda added approvalCount field
 * 07-Jan-2004: ekoperda moved class from org.recipnet.site.container package
 *              to org.recipnet.site.shared.db
 * 31-May-2006: jobollin reformatted the source
 */

package org.recipnet.site.shared.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 * SampleIdBlock represents a row in the database table sampleIdBlocks.
 */
public class SampleIdBlock {
    public static final int INVALID_SAMPLE_ID_BLOCK_ID = -1;

    public static final int INVALID_APPROVAL_COUNT = -1;

    public static final int BLOCK_SIZE = 1024;

    public static final int MIN_BLOCK_ID = 9766;

    public static final int MAX_BLOCK_ID = 97655;

    public static final int INVALID_STATUS = 0;

    public static final int PROPOSED = 100;

    public static final int PROPOSED_LOCAL = 150;

    public static final int CLAIMED = 500;

    public static final int CLAIMED_LOCAL = 550;

    public static final int CLAIMED_LOCAL_CURRENT = 560;

    public static final int CLAIMED_LOCAL_USED = 570;

    public static final int TRANSFER_PENDING = 900;

    /**
     * The id of this sample id block. Valid id's range from 1 to 2097152. Each
     * sample id block contains 1024 distinct sample id's. Sample id numbers are
     * generated by left-shifting the block id number by 10 bits and adding a
     * unique 10-bit locally-generated number. Preference should be given to
     * block id's in the range 9766 to 97655 because these will result in
     * 8-digit sample id numbers.
     */
    public int id;

    /**
     * id of the site that owns this block, or is in the process of claiming
     * this block.
     */
    public int siteId;

    /**
     * The status of this block. Valid values are:
     * <dl>
     * <dt>PROPOSED</dt>
     * <dd>Another site has proposed its use of this sample id block and is
     * soliciting comments about the proposal from its partner sites. The fact
     * that such a row exists in the local site's database means that the
     * proposal is uncontentested - no other site has yet proposed or claimed
     * this block number. A row with this status should not be inserted into the
     * local site's database until a message has been sent back to the proposing
     * site that indicates the local site's general agreement with the proposed
     * new block.</dd>
     * <dt>PROPOSED_LOCAL</dt>
     * <dd>A special variant of the PROPOSED value that indicates to the local
     * Sample Manager that it initiated the proposal for the sample id block
     * described by this row. This means that once the approvalCount reaches a
     * sufficiently high value, the block will be switched to status
     * CLAIMED_LOCAL.</dd>
     * <dt>CLAIMED</dt>
     * <dd>Another site has claimed this sample id block for itself. This
     * normally can only occur once the other site has transmitted a claim
     * message to all the other sites and received nothing but positive replies.
     * It might also occur as the result of a block transfer between sites.</dd>
     * <dt>CLAIMED_LOCAL</dt>
     * <dd>equivalent to CLAIMED, except siteId equals the local site's id.
     * This is a shortcut that indicates to the local Sample Manager that it
     * owns this block and may assign sample id's within it in the future.</dd>
     * <dt>CLAIMED_LOCAL_CURRENT</dt>
     * <dd>equivalent to CLAIMED_LOCAL, except Sample Manager uses this special
     * value to indicate to itself that this is the current block of sample
     * id's. Probably some sample id's within this block have already been used
     * and others have not. Only a single row in the database should have this
     * status value at any one time.</dd>
     * <dt>CLAIMED_LOCAL_USED</dt>
     * <dd>equivalent to CLAIMED_LOCAL, except Sample Manager uses this value
     * to indicate to itself that all sample id's within this block have already
     * been used. Normally, a single block will take on the values
     * CLAIMED_LOCAL, CLAIMED_LOCAL_CURRENT, and finally CLAIMED_LOCAL_USED, in
     * that chronological order.</dd>
     * <dt>TRANSFER_PENDING</dt>
     * <dd>indicates that the site which owns this block (as indicated by
     * siteId) has announced that it intends to transfer the block to another
     * site (as indicated by transferTagetSiteId). The transfer is incomplete,
     * however, because the target site has not yet announced that it has
     * claimed the block. (Once the transfer is complete, the status will be
     * CLAIMED, the siteId will be the new site's id, and the
     * transferTargetSiteId will be blank.)</dd>
     * </dl>
     */
    public int status;

    /** the date and time at which the proposal message was received */
    public Date proposalDate;

    /**
     * the date and time at which the claim message was received, or null if the
     * block's status is PROPOSED.
     */
    public Date claimDate;

    /**
     * the date and time at which first transfer-related message was received,
     * or null if the block's status is not TRANSFER_PENDING or
     * TRANSFER_UNCONFIRMED.
     */
    public Date transferDate;

    /**
     * id of the site that will receive this block once the transfer is
     * complete, or SiteInfo.INVALID_SITE_ID if the block's status is not
     * TRANSFER_PENDING or TRANSFER_UNCONFIRMED.
     */
    public int transferTargetSiteId;

    /**
     * significant only if status is PROPOSED_LOCAL, this is the number of other
     * sites that have responded to the local site's proposal with a
     * PROPOSAL_APPROVED message. (Had a PROPOSAL_DISAPPROVED message been
     * received, the id block row would have been deleted from this table.) When
     * this value becomes sufficiently high, the local site should send out a
     * CLAIM message for this block and switch the block's status to
     * CLAIMED_LOCAL. The special value INVALID_APPROVAL_COUNT is reserved.
     */
    public int approvalCount;

    /** default empty constructor */
    public SampleIdBlock() {
        id = INVALID_SAMPLE_ID_BLOCK_ID;
        siteId = SiteInfo.INVALID_SITE_ID;
        status = INVALID_STATUS;
        proposalDate = null;
        claimDate = null;
        transferDate = null;
        transferTargetSiteId = SiteInfo.INVALID_SITE_ID;
        approvalCount = INVALID_APPROVAL_COUNT;
    }

    /**
     * Constructor used by {@code SampleIdAgent} when creating a new proposed
     * sample id block. The new block has the status {@code PROPOSED} or
     * {@code PROPOSED_LOCAL}; if the latter then it has an
     * {@link #approvalCount} of 0.
     */
    public SampleIdBlock(int status, int id, int siteId) {
        this();
        this.id = id;
        this.siteId = siteId;
        this.status = status;
        switch (status) {
            case PROPOSED:
                this.proposalDate = new Date();
                break;
            case PROPOSED_LOCAL:
                this.proposalDate = new Date();
                this.approvalCount = 0;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public SampleIdBlock(ResultSet rs) throws SQLException {
        id = rs.getInt("id");
        siteId = rs.getInt("site_id");
        status = rs.getInt("status");
        proposalDate = rs.getTimestamp("proposalDate");
        claimDate = rs.getTimestamp("claimDate");
        transferDate = rs.getTimestamp("transferDate");
        transferTargetSiteId = rs.getInt("transferTargetSiteId");
        if (rs.wasNull()) {
            transferTargetSiteId = SiteInfo.INVALID_SITE_ID;
        }
        approvalCount = rs.getInt("approvalCount");
        if (rs.wasNull()) {
            approvalCount = INVALID_APPROVAL_COUNT;
        }
    }

    public void dbStore(ResultSet rs) throws SQLException {
        rs.updateInt("id", id);
        rs.updateInt("site_id", siteId);
        rs.updateInt("status", status);
        rs.updateTimestamp("proposalDate",
                new Timestamp(proposalDate.getTime()));
        if (claimDate != null) {
            rs.updateTimestamp("claimDate", new Timestamp(claimDate.getTime()));
        } else {
            rs.updateNull("claimDate");
        }
        if (transferDate != null) {
            rs.updateTimestamp("transferDate", new Timestamp(
                    transferDate.getTime()));
        } else {
            rs.updateNull("transferDate");
        }
        if (transferTargetSiteId != SiteInfo.INVALID_SITE_ID) {
            rs.updateInt("transferTargetSiteId", transferTargetSiteId);
        } else {
            rs.updateNull("transferTargetSiteId");
        }
        if (approvalCount != INVALID_APPROVAL_COUNT) {
            rs.updateInt("approvalCount", approvalCount);
        } else {
            rs.updateNull("approvalCount");
        }
    }
}
