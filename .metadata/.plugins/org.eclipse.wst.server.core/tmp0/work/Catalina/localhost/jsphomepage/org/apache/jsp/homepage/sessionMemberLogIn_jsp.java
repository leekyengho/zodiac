/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2016-11-26 13:00:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sessionMemberLogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String memberId = (String)session.getAttribute("memID");

	 if(memberId!=null){

      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("   alert(\"로그인 되었습니다\");\r\n");
      out.write("   location.href = \"sessionLogInConfirm.jsp\";\r\n");
      out.write("  </script>\r\n");
 } 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Simple LogIn</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body  topmargin=\"100\">\r\n");
      out.write("<form method=\"post\" action=\"sessionMemberLogInOK.jsp\">\r\n");
      out.write("<table width=\"75%\" border=\"0\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\" bgcolor=#D9e5ff>\r\n");
      out.write("  <tr bordercolor=\"#FFFF99\"> \r\n");
      out.write("    <td height=\"190\" colspan=\"7\"> \r\n");
      out.write("\t   \r\n");
      out.write("        <table width=\"50%\" border=\"1\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr bordercolor=\"#FFFF66\"> \r\n");
      out.write("            <td colspan=\"2\"><div align=\"center\">Log in</div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr > \r\n");
      out.write("            <td width=\"47%\"><div align=\"center\">ID</div></td>\r\n");
      out.write("            <td width=\"53%\"><div align=\"center\"> \r\n");
      out.write("                <input type=\"text\" name=\"memberId\">\r\n");
      out.write("              </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td><div align=\"center\">Password</div></td>\r\n");
      out.write("            <td><div align=\"center\"> \r\n");
      out.write("                <input type=\"password\" name=\"memberPw\">\r\n");
      out.write("              </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr> \r\n");
      out.write("            <td colspan=\"2\"><div align=\"center\"> \r\n");
      out.write("                <input type=\"submit\" value=\"로그인\">\r\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                <input type=\"reset\" value=\"리셋\">\r\n");
      out.write("              </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </form></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
