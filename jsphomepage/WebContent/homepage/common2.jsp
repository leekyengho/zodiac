<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String) session.getAttribute("idKey");
	session.setAttribute("id", id);    
%>
<%
	if(id!=null) {      //관리자만 접근 가능 구분
		if(id.equals("master")) {
%>
<%
		}else{
%>
<script>
	alert("권한이 없습니다.");
	location.href("index.jsp");
</script>
<%
}
%>
<%
	}else{
%>
<script>
	alert("권한이 없습니다.");
	location.href("index.jsp");
</script>
<%
	}
%>