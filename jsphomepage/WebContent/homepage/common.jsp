<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String) session.getAttribute("idKey");
	session.setAttribute("id", id);    
%>
<%
	if(session.getAttribute("id") == null){ //�α��� ���� ����
%>
 <script>
 	alert("�α����ϼ���");
 	location.href = "http://localhost:8080/jsphomepage/homepage/index.jsp";
 </script>
<%
 }
%> 