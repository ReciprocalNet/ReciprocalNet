package org.recipnet.site.content.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.recipnet.site.content.rncontrols.UserField;
import org.recipnet.site.content.rncontrols.UserPage;

public final class deactivateuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/controls.tld");
    _jspx_dependants.add("/WEB-INF/rncontrols.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_rn_userPage_userIdParamName_title_providerIdParamName_loginPageUrl_labIdParamName_currentPageReinvocationUrlParamName_completionUrlParamName_cancellationUrlParamName_authorizationFailedReasonParamName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ctl_selfForm;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_rn_userField_fieldCode_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_rn_userField_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_rn_userActionButton_userFunction_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ctl_styleBlock;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_rn_userPage_userIdParamName_title_providerIdParamName_loginPageUrl_labIdParamName_currentPageReinvocationUrlParamName_completionUrlParamName_cancellationUrlParamName_authorizationFailedReasonParamName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ctl_selfForm = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_rn_userField_fieldCode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_rn_userField_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_rn_userActionButton_userFunction_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ctl_styleBlock = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_rn_userPage_userIdParamName_title_providerIdParamName_loginPageUrl_labIdParamName_currentPageReinvocationUrlParamName_completionUrlParamName_cancellationUrlParamName_authorizationFailedReasonParamName.release();
    _jspx_tagPool_ctl_selfForm.release();
    _jspx_tagPool_rn_userField_fieldCode_nobody.release();
    _jspx_tagPool_rn_userField_nobody.release();
    _jspx_tagPool_rn_userActionButton_userFunction_label_nobody.release();
    _jspx_tagPool_ctl_styleBlock.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n\n\n\n");
      //  rn:userPage
      org.recipnet.site.content.rncontrols.UserPage _jspx_th_rn_userPage_0 = (org.recipnet.site.content.rncontrols.UserPage) _jspx_tagPool_rn_userPage_userIdParamName_title_providerIdParamName_loginPageUrl_labIdParamName_currentPageReinvocationUrlParamName_completionUrlParamName_cancellationUrlParamName_authorizationFailedReasonParamName.get(org.recipnet.site.content.rncontrols.UserPage.class);
      _jspx_th_rn_userPage_0.setPageContext(_jspx_page_context);
      _jspx_th_rn_userPage_0.setParent(null);
      _jspx_th_rn_userPage_0.setTitle("Deactivate User");
      _jspx_th_rn_userPage_0.setUserIdParamName("userId");
      _jspx_th_rn_userPage_0.setLabIdParamName("labId");
      _jspx_th_rn_userPage_0.setProviderIdParamName("providerId");
      _jspx_th_rn_userPage_0.setCancellationUrlParamName("editUserPage");
      _jspx_th_rn_userPage_0.setCompletionUrlParamName("labOrProviderPage");
      _jspx_th_rn_userPage_0.setLoginPageUrl("/login.jsp");
      _jspx_th_rn_userPage_0.setCurrentPageReinvocationUrlParamName("origUrl");
      _jspx_th_rn_userPage_0.setAuthorizationFailedReasonParamName("authorizationFailedReason");
      int _jspx_eval_rn_userPage_0 = _jspx_th_rn_userPage_0.doStartTag();
      if (_jspx_eval_rn_userPage_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        org.recipnet.site.content.rncontrols.UserPage htmlPage = null;
        if (_jspx_eval_rn_userPage_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_rn_userPage_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_rn_userPage_0.doInitBody();
        }
        htmlPage = (org.recipnet.site.content.rncontrols.UserPage) _jspx_page_context.findAttribute("htmlPage");
        do {
          out.write("\n  <br />\n  ");
          //  ctl:selfForm
          org.recipnet.common.controls.FormHtmlElement _jspx_th_ctl_selfForm_0 = (org.recipnet.common.controls.FormHtmlElement) _jspx_tagPool_ctl_selfForm.get(org.recipnet.common.controls.FormHtmlElement.class);
          _jspx_th_ctl_selfForm_0.setPageContext(_jspx_page_context);
          _jspx_th_ctl_selfForm_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_rn_userPage_0);
          int _jspx_eval_ctl_selfForm_0 = _jspx_th_ctl_selfForm_0.doStartTag();
          if (_jspx_eval_ctl_selfForm_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_ctl_selfForm_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_ctl_selfForm_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_ctl_selfForm_0.doInitBody();
            }
            do {
              out.write("\n    <center>\n      <h2>\n        <p class=\"errorMessage\" >\n          You are about to deactivate the username\n          \"<font color=\"blue\">");
              //  rn:userField
              org.recipnet.site.content.rncontrols.UserField _jspx_th_rn_userField_0 = (org.recipnet.site.content.rncontrols.UserField) _jspx_tagPool_rn_userField_fieldCode_nobody.get(org.recipnet.site.content.rncontrols.UserField.class);
              _jspx_th_rn_userField_0.setPageContext(_jspx_page_context);
              _jspx_th_rn_userField_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ctl_selfForm_0);
              _jspx_th_rn_userField_0.setFieldCode(UserField.USER_NAME);
              int _jspx_eval_rn_userField_0 = _jspx_th_rn_userField_0.doStartTag();
              if (_jspx_th_rn_userField_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_rn_userField_fieldCode_nobody.reuse(_jspx_th_rn_userField_0);
              out.write("</font>\", for\n          <font color=\"blue\">");
              if (_jspx_meth_rn_userField_1(_jspx_th_ctl_selfForm_0, _jspx_page_context))
                return;
              out.write("</font>. This user will not be\n          able to log in again.  Are you sure you want to do this?\n        </p>\n      </h2>\n      ");
              //  rn:userActionButton
              org.recipnet.site.content.rncontrols.UserActionButton _jspx_th_rn_userActionButton_0 = (org.recipnet.site.content.rncontrols.UserActionButton) _jspx_tagPool_rn_userActionButton_userFunction_label_nobody.get(org.recipnet.site.content.rncontrols.UserActionButton.class);
              _jspx_th_rn_userActionButton_0.setPageContext(_jspx_page_context);
              _jspx_th_rn_userActionButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ctl_selfForm_0);
              _jspx_th_rn_userActionButton_0.setUserFunction(UserPage.UserFunction.CANCEL);
              _jspx_th_rn_userActionButton_0.setLabel("Cancel");
              int _jspx_eval_rn_userActionButton_0 = _jspx_th_rn_userActionButton_0.doStartTag();
              if (_jspx_th_rn_userActionButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_rn_userActionButton_userFunction_label_nobody.reuse(_jspx_th_rn_userActionButton_0);
              out.write("\n      ");
              //  rn:userActionButton
              org.recipnet.site.content.rncontrols.UserActionButton _jspx_th_rn_userActionButton_1 = (org.recipnet.site.content.rncontrols.UserActionButton) _jspx_tagPool_rn_userActionButton_userFunction_label_nobody.get(org.recipnet.site.content.rncontrols.UserActionButton.class);
              _jspx_th_rn_userActionButton_1.setPageContext(_jspx_page_context);
              _jspx_th_rn_userActionButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ctl_selfForm_0);
              _jspx_th_rn_userActionButton_1.setUserFunction(UserPage.UserFunction.DEACTIVATE_USER);
              _jspx_th_rn_userActionButton_1.setLabel("Yes, Deactivate");
              int _jspx_eval_rn_userActionButton_1 = _jspx_th_rn_userActionButton_1.doStartTag();
              if (_jspx_th_rn_userActionButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_rn_userActionButton_userFunction_label_nobody.reuse(_jspx_th_rn_userActionButton_1);
              out.write("\n    </center>\n  ");
              int evalDoAfterBody = _jspx_th_ctl_selfForm_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_ctl_selfForm_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_ctl_selfForm_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_ctl_selfForm.reuse(_jspx_th_ctl_selfForm_0);
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_ctl_styleBlock_0(_jspx_th_rn_userPage_0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_rn_userPage_0.doAfterBody();
          htmlPage = (org.recipnet.site.content.rncontrols.UserPage) _jspx_page_context.findAttribute("htmlPage");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_rn_userPage_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_rn_userPage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_rn_userPage_userIdParamName_title_providerIdParamName_loginPageUrl_labIdParamName_currentPageReinvocationUrlParamName_completionUrlParamName_cancellationUrlParamName_authorizationFailedReasonParamName.reuse(_jspx_th_rn_userPage_0);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_rn_userField_1(javax.servlet.jsp.tagext.JspTag _jspx_th_ctl_selfForm_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  rn:userField
    org.recipnet.site.content.rncontrols.UserField _jspx_th_rn_userField_1 = (org.recipnet.site.content.rncontrols.UserField) _jspx_tagPool_rn_userField_nobody.get(org.recipnet.site.content.rncontrols.UserField.class);
    _jspx_th_rn_userField_1.setPageContext(_jspx_page_context);
    _jspx_th_rn_userField_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ctl_selfForm_0);
    int _jspx_eval_rn_userField_1 = _jspx_th_rn_userField_1.doStartTag();
    if (_jspx_th_rn_userField_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_rn_userField_nobody.reuse(_jspx_th_rn_userField_1);
    return false;
  }

  private boolean _jspx_meth_ctl_styleBlock_0(javax.servlet.jsp.tagext.JspTag _jspx_th_rn_userPage_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ctl:styleBlock
    org.recipnet.common.controls.HtmlPageStyleBlock _jspx_th_ctl_styleBlock_0 = (org.recipnet.common.controls.HtmlPageStyleBlock) _jspx_tagPool_ctl_styleBlock.get(org.recipnet.common.controls.HtmlPageStyleBlock.class);
    _jspx_th_ctl_styleBlock_0.setPageContext(_jspx_page_context);
    _jspx_th_ctl_styleBlock_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_rn_userPage_0);
    int _jspx_eval_ctl_styleBlock_0 = _jspx_th_ctl_styleBlock_0.doStartTag();
    if (_jspx_eval_ctl_styleBlock_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ctl_styleBlock_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ctl_styleBlock_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ctl_styleBlock_0.doInitBody();
      }
      do {
        out.write("\n    .errorMessage  { color: red; font-weight: bold;}\n  ");
        int evalDoAfterBody = _jspx_th_ctl_styleBlock_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ctl_styleBlock_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ctl_styleBlock_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ctl_styleBlock.reuse(_jspx_th_ctl_styleBlock_0);
    return false;
  }
}
