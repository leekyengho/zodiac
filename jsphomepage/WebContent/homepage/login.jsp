<%@ page language="java" contentType="text/html; charset=utf-8"%>
<link href="style.css" rel="stylesheet" type="text/css">
<form method="post" action="sessionMemberLogInOK.jsp">

<div class="loginbox">
	<div class="row" align="right">
		<div class="col-lg-2 col-lg-offset-4">
			<input type="text" class="form-control" placeholder="id">
		</div>
		<div class="col-lg-2">
			<input type="text" class="form-control" placeholder="password">	
		</div>
		<div class="col-lg-1">
			<button class="btn btn-default" type="submit">로그인</button>
		</div>
		<div class="col-lg-1">
			<a class="btn btn-default" href="template.jsp?page=member" role="button">회원가입</a>
		</div>
	</div>
</div>