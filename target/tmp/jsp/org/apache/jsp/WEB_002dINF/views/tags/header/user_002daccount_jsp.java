package org.apache.jsp.WEB_002dINF.views.tags.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002daccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"tabbable\" id=\"demo-tab\"> <!-- Only required for left/right tabs -->\r\n");
      out.write("    <!-- Tab Definitions-->               \r\n");
      out.write("    <ul class=\"nav nav-tabs\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#csettings\" data-toggle=\"tab\">Company settings</a></li>\r\n");
      out.write("      <li><a href=\"#team\" data-toggle=\"tab\">Team</a></li>\r\n");
      out.write("      <li><a href=\"#isettings\" data-toggle=\"tab\">Profile Settings</a></li>      \r\n");
      out.write("    </ul>  \r\n");
      out.write("\r\n");
      out.write("    <!-- Tab Content-->\r\n");
      out.write("    <div class=\"tab-content\">                  \r\n");
      out.write("      <div class=\"tab-pane\" id=\"csettings\">\r\n");
      out.write("        <h2>Settings</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("          <code>[Company Name]</code>  \r\n");
      out.write("        </p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a id=\"address\" class=\"textLink\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">Company Settings</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a id=\"contact\" class=\"textLink\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">Contact</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul> \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"tab-pane\" id=\"team\">\r\n");
      out.write("        <h2>Team</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("          <code>Display Team Members</code>   \r\n");
      out.write("        </p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a id=\"team\" class=\"textLink\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">Team List</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div> \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"tab-pane\" id=\"isettings\">\r\n");
      out.write("        <h2>Settings</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("          <code>Project Settings</code>  \r\n");
      out.write("        </p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a id=\"invoicefee\" class=\"textLink\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\">Fee</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a id=\"reminderfee\" class=\"textLink\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">Reminders</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul> \r\n");
      out.write("      </div> \r\n");
      out.write("    <!--tab-content-->\r\n");
      out.write("  </div> <!--tabbable-->   \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/csettings?number=3&date=2014-12-27");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/contact?number=3&date=2014-12-27");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/team");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/isettings?number=3&date=2014-12-27");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/reminderfee?number=3&date=2014-12-27");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }
}