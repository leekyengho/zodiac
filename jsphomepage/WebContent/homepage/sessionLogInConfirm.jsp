<%@ page contentType="text/html; charset=euc-kr" %>
<% 
	String memberId = (String)session.getAttribute("memID");
	
	if(memberId == null){
%> 
	<script>
	  alert("�α��� ���� �ʾҽ��ϴ�.");
	     location.href="sessionMemberLogIn.jsp";
	</script>
<%	}	%>
<html>
<head>
<title>Simple LogIn</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body  topmargin="100">
<table width="75%" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#660000" bgcolor="#FFFF99">
  <tr bordercolor="#FFFF99"> 
    <td height="190" colspan="7"> 
      <table width="50%" border="1" align="center" cellspacing="0" cellpadding="0">
        <tr bordercolor="#FFFF66"> 
          <td colspan="2"><div align="center">Log On Page</div></td>
        </tr>
        <tr >         
          <td><div align="center"> 
           <strong><%= memberId %></strong>
			���� �α��� �ϼ̽��ϴ�. 
            </div></td>
          <td><div align="center"> 
           <a href="sessionLogOut.jsp"><strong>LOGOUT</strong></a>
            </div></td>
        </tr>
      </table>
     </td>
  </tr>
</table>
</body>
</html>