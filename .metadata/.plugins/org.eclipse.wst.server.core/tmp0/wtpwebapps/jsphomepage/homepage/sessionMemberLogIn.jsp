<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	String memberId = (String)session.getAttribute("memID");

	 if(memberId!=null){
%>

  <script>
   alert("로그인 되었습니다");
   location.href = "sessionLogInConfirm.jsp";
  </script>
<% } %>
<link href="style.css" rel="stylesheet" type="text/css">
<form method="post" action="sessionMemberLogInOK.jsp">
<table width="75%" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor=#D9e5ff>
  <tr bordercolor="#FFFF99"> 
    <td height="190" colspan="7"> 
	   
        <table width="50%" border="1" align="center" cellspacing="0" cellpadding="0">
          <tr bordercolor="#FFFF66"> 
            <td colspan="2"><div align="center">Log in</div></td>
          </tr>
          <tr > 
            <td width="47%"><div align="center">ID</div></td>
            <td width="53%"><div align="center"> 
                <input type="text" name="memberId">
              </div></td>
          </tr>
          <tr> 
            <td><div align="center">Password</div></td>
            <td><div align="center"> 
                <input type="password" name="memberPw">
              </div></td>
          </tr>
          <tr> 
            <td colspan="2"><div align="center"> 
                <input type="submit" value="로그인">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                <input type="reset" value="리셋">
              </div></td>
          </tr>
        </table>
      </form></td>
  </tr>
</table>