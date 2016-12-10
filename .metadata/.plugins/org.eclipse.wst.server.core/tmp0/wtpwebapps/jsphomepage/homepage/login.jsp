<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML>
<head>
<meta charset="utf-8"/>
<%
	request.setCharacterEncoding("utf-8");
	String id = (String) session.getAttribute("idKey");
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function loginCheck() {
		if(document.loginFrm.id.value =="") {
			alert("아이디를 입력해 주세요");
			document.loginFrm.id.focus();
			return;
		}
		if(document.loginFrm.pass.value=="") {
			alert("비밀번호를 입력해주세요");
			document.loginFrm.pass.focus();
			return;
		}
		document.loginFrm.submit();
	}
</script>
</head>
<body>
<br/><br/>
<div align="center">
<%
	if(id!=null) {
		if(id.equals("master")) {
%>
<b><%=id %></b>관리자님 안녕하세요
<a href="logout.jsp">로그아웃</a>
<a href="memberList.jsp" target="_blank">회원관리</a>
<%
		}else{
%>
<b><%=id %></b>일반유저님 안녕하세요
<a href="logout.jsp">로그아웃</a>
<a href="modifyMember.jsp?id=<%=id%>" target="_black">개인정보수정</a>
<%
}
%>
<%
	}else{
%>
<form name="loginFrm" method="post" action="loginProc.jsp">
<table>
	<tr>
		<td align="center" colspan="2"><h4>로그인</h4></td>
	</tr>
	<tr>
		<td>아 이 디</td>
		<td><input type="text" name="id" value=""></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pass" value=""></td>
	</tr>
	<tr>
		<td colspan="2">
			<div align="right">
				<input type="button" value="로그인" onClick="loginCheck()">&nbsp;
				<input type="button" value="회원가입" onClick="window.open('member.jsp')">
			</div>
		</td>
	</tr>	
</table>
</form>
<%} %>
</div>
</body>
</html>