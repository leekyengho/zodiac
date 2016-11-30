<%@ page language="java" contentType="text/html; charset=utf-8"%>

<!DOCTYPE>
<html>
<head>
<jsp:useBean id="mMgr" class="ch10.RegisterMgrPool"/>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	boolean result = mMgr.checkId(id);
%>
<meta charset ="UTF-8">
<title>ID 중복체크</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div align="center">
		<br/><b><%=id%></b>
		<%
			if(result) {
				out.println("는 이미 존재하는 ID입니다.<p>");
			} else {
				out.println("는 사용가능한 ID입니다.<p>");
			}
		%>
		<a href="#" onClick="self.close()">닫기</a>
	</div>
</body>
</html>