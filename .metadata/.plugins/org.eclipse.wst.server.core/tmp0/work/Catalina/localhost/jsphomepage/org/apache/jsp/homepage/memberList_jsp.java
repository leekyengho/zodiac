/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2016-11-30 03:15:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ch10.*;

public final class memberList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common2.jsp", out, false);
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>회원목록</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFFFCC\">\r\n");
      out.write("<div align = \"Center\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<h1>회원정보</h1>\r\n");
      out.write("<a href = \"member.jsp\">회원추가</a>\r\n");
      out.write("<br/><br/>\r\n");
      out.write("\r\n");
      out.write("<table bordercolor=\"#0000ff\" border=\"1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("  <td><strong>ID</strong></td>\r\n");
      out.write("  <td><strong>NAME</strong></td>\r\n");
      out.write("  <td><strong>GENDER</strong></td>\r\n");
      out.write("  <td><strong>EMAIL</strong></td>\r\n");
      out.write("  <td><strong>PHONE</strong></td>\r\n");
      out.write("  <td><strong>ZIPCODE/ADDRESS</strong></td>\r\n");
      out.write("  <td><strong>JOB</strong></td>\t\r\n");
      out.write("  <td><strong>수정</strong></td>\r\n");
      out.write("  <td><strong>삭제</strong></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      ch10.RegisterMgrPool regMgr = null;
      regMgr = (ch10.RegisterMgrPool) _jspx_page_context.getAttribute("regMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (regMgr == null){
        regMgr = new ch10.RegisterMgrPool();
        _jspx_page_context.setAttribute("regMgr", regMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	Vector vlist = regMgr.getMemberList();
	int counter = vlist.size();
	for(int i=0; i<vlist.size(); i++){
  		RegisterBean regBean = (RegisterBean)vlist.get(i);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(regBean.getId());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getName());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getGender());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getEmail());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getPhone());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getZipcode());
      out.write('/');
      out.print(regBean.getAddress());
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(regBean.getJob());
      out.write("</td>\r\n");
      out.write("<td><a href = \"modifyMember.jsp?id=");
      out.print(regBean.getId() );
      out.write("\">수정</a></td>\r\n");
      out.write("<td><a href = \"deleteMember.jsp?id=");
      out.print(regBean.getId() );
      out.write("\"\r\n");
      out.write("\t   onclick = \"return confirm('정말 삭제하시겠습니까?');\">삭제</a></td>\r\n");

   	}

      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("total records : ");
      out.print(counter);
      out.write(" \r\n");
      out.write("<br/><br/>\r\n");
      out.write("<form name=\"searchMemberFrm\"  method=\"post\" action=\"searchMember.jsp\">\r\n");
      out.write("이름 검색  : <input type = \"text\" name = \"searchName\"> <input type = \"submit\" value = \"검색\"> \r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
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
