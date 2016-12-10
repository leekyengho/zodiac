<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ page import="board.*" %>
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
<!-- 파일 boardForm.js : 폼의 각 입력 값이 있는지를 검토하는 함수 구현 -->
<script language=JavaScript src="boardForm.js"></script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	<div id="content">
		<%
			request.setCharacterEncoding("utf-8");
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
		

	</div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>