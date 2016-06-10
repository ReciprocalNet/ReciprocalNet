/*
 * Reciprocal Net Project
 *
 * @(#) BadAtomException.java
 *
 * 20-Nov-2002: jobollin moved this class to org.recipnet.site.misc from *.jamm
 * 18-Feb-2003: jobollin changed the constructor's parameter's name and added
 *              javadoc comments
 * 21-Feb-2003: jobollin reformatted the source as part of task #749
 * 07-Jan-2004: ekoperda moved class from org.recipnet.site.misc package to
 *              org.recipnet.site.applet.jamm; changed package references to
 *              match source tree reorganization
 */

package org.recipnet.site.applet.jamm;
import org.recipnet.site.wrapper.FileFormatException;

/**
 * A <code>FileFormatException</code> subclass for use when the problem is
 * specific to an atom record in the input file
 *
 * @author John C. Bollinger
 * @version 0.6.0
 */
public class BadAtomException
        extends FileFormatException {

    /**
     * Creates a new <code>BadAtomException</code> with the specified detail
     * message
     *
     * @param message a <code>String</code> containing the detail message for
     *        this exception
     */
    public BadAtomException(String message) {
        super(message);
    }
}
