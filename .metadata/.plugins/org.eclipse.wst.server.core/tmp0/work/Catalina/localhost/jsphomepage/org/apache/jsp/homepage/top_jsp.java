/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2016-11-26 17:44:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("��\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".dropdown>ul>li {\r\n");
      out.write(" display: inline-block;\r\n");
      out.write(" position: relative;\r\n");
      out.write("}\r\n");
      out.write(".dropdown>ul>li>ul {\r\n");
      out.write(" position: absolute;\r\n");
      out.write(" list-style-type: none;\r\n");
      out.write(" padding-left: 0px;\r\n");
      out.write(" padding-top: 5px;\r\n");
      out.write(" display: none;\r\n");
      out.write("}\r\n");
      out.write(".dropdown>ul>li:hover>ul {\r\n");
      out.write(" display: block;\r\n");
      out.write("}\r\n");
      out.write("w:hover {\r\n");
      out.write(" text-decoration: none;\r\n");
      out.write(" color: red\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <form name=\"top\">\r\n");
      out.write("  <font face=\"Yang Rounded\">\r\n");
      out.write("   <table height=\"170px\" border=\"0\" width=\"1330px\"\r\n");
      out.write("    style=\"background-color: white\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>\r\n");
      out.write("      ");

       if (session.getAttribute("id") == null) {
      
      out.write("\r\n");
      out.write("      <table width=\"1330px\" height=\"40px\" border=\"0\" align=\"right\"\r\n");
      out.write("       border=\"0\" style=\"color: white; background-color: black\">\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td><audio controls\r\n");
      out.write("          style=\"width:250px; margin-left:7%; margin-top:1%;\">\r\n");
      out.write("         <source src=\"../mp3/letitgo-frost.mp3\" type=\"audio/mpeg\"></audio>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td style=\"width: 550px\"></td>\r\n");
      out.write("        <td onClick=\"gologin()\" style=\"cursor: pointer\"><w>濡�洹몄��</w></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td onClick=\"gojoin()\" style=\"cursor: pointer\"><w>����媛���</w></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td onClick=\"goidfind()\" style=\"cursor: pointer\"><w>���대��李얘린</w></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td onClick=\"gopwfind()\" style=\"cursor: pointer\"><w>鍮�諛�踰��몄갼湲�</w></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table> \r\n");
} else {
      out.write("\r\n");
      out.write("      <table width=\"1340px\" height=\"40px\" border=\"0\" align=\"right\"\r\n");
      out.write("       border=\"0\" style=\"color: white; background-color: black\">\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td><audio controls\r\n");
      out.write("          style=\"width:250px; margin-left:7%; margin-top:1%;\">\r\n");
      out.write("         <source src=\"../mp3/letitgo-frost.mp3\" type=\"audio/mpeg\"></audio>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td style=\"width: 550px\"></td>\r\n");
      out.write("        <td onClick=\"myinfomenu()\" style=\"cursor: pointer\"><w>");
      out.print(session.getAttribute("name"));
      out.write("��</w></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td onClick=\"logout()\" style=\"cursor: pointer\"><w>濡�洹몄����</w></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td onClick=\"myinfomenu()\" style=\"cursor: pointer\"><w>����\r\n");
      out.write("         ��蹂� 愿�由�</w></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
} 
      out.write("\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr align=\"center\">\r\n");
      out.write("     <td align=\"center\" style=\" height: 180px;\">\r\n");
      out.write("      <table width=\"1330px\" align=center>\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("         <table width=\"500px\" height=\"200px\" align=center border=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td align=\"center\"><a href=\"home.jsp\"><img src=\"../img/miki.png\"\r\n");
      out.write("            width=\"400px\" height=\"100px\" onClick=\"gohome()\"></a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("        </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>\r\n");
      out.write("      <table width=\"1000px\" border=\"0\" align=\"center\" border=\"0\">\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("         <table width=\"1000px\" border=\"0\" align=\"left\" border=\"0\"\r\n");
      out.write("          style=\"color: black\">\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("             <ul align=\"center\" style=\"font-size: 17px\">\r\n");
      out.write("              <li align=\"center\" onClick=\"gohome()\"\r\n");
      out.write("               style=\"cursor: pointer;\"><w> HOME</w></li>\r\n");
      out.write("              <li style=\"width: 60px\">|</li>\r\n");
      out.write("              <li align=\"center\" onClick=\"profilemenu()\"\r\n");
      out.write("               style=\"cursor: pointer;\"><w>PROFILE</w></li>\r\n");
      out.write("              <li style=\"width: 60px\">|</li>\r\n");
      out.write("              <li align=\"left\" style=\"cursor: pointer;\"><w>MINE</w>\r\n");
      out.write("               <ul style=\"font-size: 16px;\">\r\n");
      out.write("                <li style=\"background-color: white;\"\r\n");
      out.write("                 onClick=\"minemenu()\">collection&nbsp;</li>\r\n");
      out.write("                <li style=\"background-color: white; margin-top: 2px\"\r\n");
      out.write("                 onClick=\"studymenu()\">study&nbsp;</li>\r\n");
      out.write("               </ul></li>\r\n");
      out.write("              <li style=\"width: 60px\">|</li>\r\n");
      out.write("              <li align=\"center\" onClick=\"guestmenu()\"\r\n");
      out.write("               style=\"cursor: pointer;\"><w> GUEST</w></li>\r\n");
      out.write("              <li style=\"width: 60px\">|</li>\r\n");
      out.write("              <li align=\"left\" style=\"cursor: pointer;\"><w> Q&A</w>\r\n");
      out.write("               <ul style=\"font-size: 16px; width: 55px;\">\r\n");
      out.write("                <li style=\"background-color: white;\"\r\n");
      out.write("                 onClick=\"noticemenu()\">怨듭��ы��&nbsp;</li>\r\n");
      out.write("                <li style=\"background-color: white; margin-top: 2px\"\r\n");
      out.write("                 onClick=\"faqmenu()\">FAQ&nbsp;</li>\r\n");
      out.write("                <li style=\"background-color: white; margin-top: 2px\"\r\n");
      out.write("                 onClick=\"questionmenu()\">Q&A&nbsp;</li>\r\n");
      out.write("               </ul></li>\r\n");
      out.write("             </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("           </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td height=\"20px\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("        </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table> \r\n");
      out.write("     </font>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
