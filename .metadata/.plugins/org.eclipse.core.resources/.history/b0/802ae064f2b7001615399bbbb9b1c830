<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="board.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	String num = request.getParameter("num");
	String passwd = request.getParameter("passwd");
	
	BoardMgr brddb = new BoardMgr();
	int inum = Integer.parseInt(num);
	
	if( !brddb.isPasswd(inum, passwd)) {
%>		  
	<script>
		alert("비밀번호가 다릅니다.");
		history.go(-1);
	</script>
<%
	}else{
		brddb.deleteBoard(inum);
		response.sendRedirect("listBoard.jsp");
	}
%>



</body>
</html>