<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String) session.getAttribute("idKey");
	String cPath = request.getContextPath();
	String url = "member.jsp";
	String label = "회원가입";
	
		if(id!=null) {
			url = "modifyMember.jsp";
			label = "회원수정";
		}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>head</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table width="1280" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="5">
	<table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
		<tr>
			<td height="50">
	<a href="<%=cPath%>/homepage/index.jsp" target="_parent" onFocus="this.blur();">
	<img src ="images/ho.png" border=0></a>
			</td>
		</tr>
	</table>
			</td>
		</tr>
		<tr height = "20">
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
			<td width="250">&nbsp;</td>
			<td><font size="3"><a href="<%=url%>" target="content"><b><%=label%></b></a></font></td>
			<td><font size="3"><b>게시판</b></font></td>
			<td><font size="3"><b>게시판2</b></font></td>
			<td>게시판3</td>
		</tr>
	</table>
</body>
</html>