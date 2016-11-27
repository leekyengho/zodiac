<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
    String content = request.getParameter("content");
%>
<%
	String pagefile= "/homepage/" + request.getParameter("page");
	if (pagefile==null) { pagefile="index"; }
 %>
<!DOCTYPE HTML>
<head>
<meta charset="utf-8"/>
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
		<jsp:include page='<%=pagefile+".jsp" %>'/>
	</div>
	<div class="push"></div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>