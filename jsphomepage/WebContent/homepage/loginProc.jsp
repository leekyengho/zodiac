<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="mMgr" class="ch10.RegisterMgrPool"/>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String url = "login.jsp";
	String msg = "로그인에 실패하였습니다.";
	
	boolean result = mMgr.passCheck(id, pass);
	if(result) {
		session.setAttribute("idKey", id);
		msg = "로그인에 성공하였습니다.";
	}
%>
<script>
	alert("<%=msg%>");
	location.href="index.jsp";
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>