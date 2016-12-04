<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="board.*,java.text.SimpleDateFormat" %>
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
<script >
<!--
function deleteConfirm(num) {
	ok = confirm("삭제하시겠습니까?");
	if (ok) {
		location.href = "passwordBoard.jsp?num=" + num ;
	} else {
		return;
	}			
}
-->
</script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	<div id="content">
		<%
		String name = ""; 
		String email = "";
		String regdate = "";
		String hit = "";
		String title = ""; 
		String content = "";
		
		
		String num = request.getParameter("num");
		
		if (num != null) {	
			int inum = Integer.parseInt(num);
			BoardMgr brddb = new BoardMgr(); 
			brddb.updateHit(inum);
			BoardBean brd = brddb.getBoard(inum); 
			
			name = brd.getName();
			email = brd.getEmail();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			regdate = df.format( brd.getRegdate());
			hit = Integer.toString( brd.getHit());
			title = brd.getTitle();
			content = brd.getContent();
		};
	%>		

		<h2>게시판 보기 프로그램 </h2> <hr>
		
		<div align=center>
		<table width=700 border=0 cellspacing=0 cellpadding=7>
		 <tr><td align=center>
		 	 <table border=0>
		 	   <tr>
		 	    <td>
					<table width=650 border=1 cellspacing=0 cellpadding=5 >
					    <tr>
					     <td width=100 bgcolor=papayawhip align=left>이 름  </td>
					     <td width=180 align=left><%=name %> </td>
					     <td width=100 bgcolor=papayawhip align=left>전자메일 </td>
					     <td align=left ><%=email %></td>
					    </tr>	
					    <tr>
					     <td width=100 bgcolor=papayawhip align=left>작성일 </td>
					     <td width=180 align=left><%=regdate %> </td>
					     <td width=100 bgcolor=papayawhip align=left>조회수</td>
					     <td align=left><%=hit %></td>
					    </tr>	
						<tr >
					     <td width=100  bgcolor=papayawhip align=left>제 목 </td>
					     <td colspan=3 align=left><%=title %></td>
						</tr>
					    <tr height=300><td colspan=4 align=left valign=top><%=content%></td>
						</tr>
					</table>
				 <td>
			    </tr>
				<tr>
			     <td height=20 colspan=4></td>
			    </tr>
				<tr>
			     <td colspan=4>
			  		<input type=button value="수정" onClick="editBoard.jsp&num=<%=num %>'">
			    	<input type=button value="삭제" onClick="deleteConfirm(<%=num%>)"> 
					<!-- 목록보기 버튼은 listboard.jsp로 이동 -->
					<input type=button value="목록보기" onClick="location.href='listBoard.jsp'">
				 </td>
			    </tr> 
		   	</table>  	
		  </td>
		</tr>
		</table>
		</div>
	</div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>