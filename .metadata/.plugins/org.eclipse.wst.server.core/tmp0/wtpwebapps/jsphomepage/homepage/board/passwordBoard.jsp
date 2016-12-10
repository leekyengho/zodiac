<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE HTML>
<head>
<meta charset="EUC-KR"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script
  src="https://code.jquery.com/jquery-3.1.1.min.js"
  integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
  crossorigin="anonymous"></script>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	<div id="content">
		<h2>패스워드 입력  </h2> <hr> <br><br>
		<form method=post action=deleteBoard.jsp>
		<input type=hidden name="num" value=<%=request.getParameter("num") %>>
		<div align=center>
		<table width=300 cellspacing=10 cellpadding=5>
			<tr>
				<td colspan=2 bgcolor=papayawhip>비밀번호를 입력하세요.</td>
			</tr>
			<tr>
				<td align=right> 비밀번호 </td>
				<td align=left> <input type=password  name=passwd size=20 maxlength=20></td>
			</tr>
			<tr>
				<td colspan=2><hr color=papayawhip size=1></td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<input type=submit value="확인" >
			    	<input type=reset value="다시쓰기" > 
					<input type=button value="취소" onClick="history.go(-1)">
				</td>
			</tr>
		</table>
		</div>
		</form>
	</div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>