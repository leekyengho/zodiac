/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2016-11-30 01:54:19 UTC
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

public final class modifyMember_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>회원 정보 수정</title>\r\n");
      out.write("<script>\r\n");
      out.write("    function send(){\r\n");
      out.write("        var id  = document.getElementById(\"id\").value;\r\n");
      out.write("        var pw = document.getElementById(\"passwd\").value;\r\n");
      out.write("        var name = document.getElementById(\"name\").value;\r\n");
      out.write("        /*\r\n");
      out.write("         -> ID값 존재여부 확인 \r\n");
      out.write("         -> ID값 없으면 경고창 출력(id 입력 필드에 포커스 설정)\r\n");
      out.write("        */\r\n");
      out.write("        if(id.trim() == '') {\r\n");
      out.write("            alert('아이디를 입력하지 않았습니다.');\r\n");
      out.write("            document.getElementById(\"id\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /*\r\n");
      out.write("        -> PWD값 존재여부 확인 \r\n");
      out.write("        -> PWD값 없으면 경고창 출력(PWD 입력 필드에 포커스 설정)\r\n");
      out.write("        */\r\n");
      out.write("        if(pw.trim() == '') {\r\n");
      out.write("            alert('패스워드를 입력하지 않았습니다.');\r\n");
      out.write("            document.getElementById(\"passwd\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(name.trim() == '') {\r\n");
      out.write("            alert('이름을 입력하지 않았습니다.');\r\n");
      out.write("            document.getElementById(\"name\").focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        return true;\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      ch10.RegisterMgrPool regMgr = null;
      regMgr = (ch10.RegisterMgrPool) _jspx_page_context.getAttribute("regMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (regMgr == null){
        regMgr = new ch10.RegisterMgrPool();
        _jspx_page_context.setAttribute("regMgr", regMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	Vector vlist = regMgr.getMemberList();
	int counter = vlist.size();
	String getid = request.getParameter("id");
	for(int i=0; i<vlist.size(); i++){
  		RegisterBean regBean = (RegisterBean)vlist.get(i);
  		if(getid.equals(regBean.getId())){

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form id=\"form\"  method=\"post\" action=\"modifyMemberProc.jsp\" onsubmit=\"return send();\">\r\n");
      out.write("\t<table border=1 cellpadding=7 cellspacing=0 >\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>아이디 </td> \r\n");
      out.write("    \t\t<td align=left><input type=\"text\" name=\"id\"  maxlength=20 value = ");
      out.print(regBean.getId() );
      out.write(" id = \"id\"></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>패스워드 </td> \r\n");
      out.write("   \t\t\t<td align=left><input type=\"password\" name=\"passwd\"  maxlength=20 value = ");
      out.print(regBean.getPasswd() );
      out.write(" id = \"passwd\"></td>\r\n");
      out.write("   \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>이름 </td> \r\n");
      out.write("   \t\t\t<td align=left><input type=\"text\" name=\"name\"  maxlength=20 value = ");
      out.print(regBean.getName() );
      out.write(" id = \"name\"></td>\r\n");
      out.write("   \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>성별</td>\r\n");
      out.write("    \t\t<td align=left><input type=\"radio\" name=\"gender\" value = \"남자\" checked>남자\r\n");
      out.write("    \t\t<input type=\"radio\" name=\"gender\" value = \"여자\">여자\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>이메일 </td>\r\n");
      out.write("   \t\t\t<td align=left><input type=\"text\" name=\"email\" maxlength=30 size=40 value = ");
      out.print(regBean.getEmail());
      out.write("></td>\r\n");
      out.write("   \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>전화번호 </td>\r\n");
      out.write("  \t\t\t<td align=left><input type=\"text\" name=\"phone\" maxlength=30 value = ");
      out.print(regBean.getPhone());
      out.write("></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>우편번호</td>\r\n");
      out.write("  \t\t\t<td align=left><input type=\"text\" name=\"zipcode\" maxlength=7 value = ");
      out.print(regBean.getZipcode());
      out.write("></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>주소 </td>\r\n");
      out.write("   \t\t\t<td align=left><input type=\"text\" name=\"address\" maxlength=30 size=60 value = ");
      out.print(regBean.getAddress());
      out.write("></td>\r\n");
      out.write("   \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=lightyellow>직업 </td>\r\n");
      out.write("  \t\t\t<td align=left><input type=\"text\" name=\"job\" maxlength=30 size=40 value = ");
      out.print(regBean.getJob());
      out.write("></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=2 align=center><input type=\"submit\" value=\"수정하기\" > \r\n");
      out.write("   \t\t\t<input type=\"reset\" value=\"취소\"></td></tr>\r\n");

  		}
	}

      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
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
