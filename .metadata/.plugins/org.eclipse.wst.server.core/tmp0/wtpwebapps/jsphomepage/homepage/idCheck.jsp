<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:useBean id="mMgr" class="ch10.RegisterMgrPool"/>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = request.getParameter("id");
	boolean result = mMgr.checkId(id);
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ID �ߺ�üũ</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div align="center">
		<br/><b><%=id%></b>
		<%
			if(result) {
				out.println("�� �̹� �����ϴ� ID�Դϴ�.<p>");
			} else {
				out.println("�� ��밡���� ID�Դϴ�.<p>");
			}
		%>
		<a href="#" onClick="self.close()">�ݱ�</a>
	</div>
</body>
</html>