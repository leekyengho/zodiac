<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String) session.getAttribute("idKey");
	session.setAttribute("id", id);    
%>
<%
	if(session.getAttribute("id") == null){ //로그인 여부 구분
%>
 <script>
 	alert("로그인하세요");
 	location.href = "http://localhost:8080/jsphomepage/homepage/index.jsp";
 </script>
<%
 }
%> 