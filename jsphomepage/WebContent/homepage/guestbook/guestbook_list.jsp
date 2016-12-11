<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.util.Vector,guestbook.*,java.text.SimpleDateFormat" %>
<jsp:include page="/homepage/common.jsp"/>
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
<script language=JavaScript src="../boardForm.js"></script>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	</div>
	<div id="content">
		<h2>한줄 방명록 </h2>
		<hr>  
		<center>
			<% 
				
				String gb_num = request.getParameter("gb_num");
				
				GuestMgr brddb = new GuestMgr();	 	
				Vector<GuestBean> list = brddb.getBoardList(); 
			   	int counter = list.size();
			   	int row = 0;
			   		
			   	if (counter > 0) {
			%>
		    <table width=800  cellpadding=3 cellspacing=3 >
		    
		    <tr>
		       <td align=center width=60 bgcolor=lightgray><font color=blue><b>번호</b></font></td>
		       <td align=center width=80 bgcolor=lightgray><font color=blue><b>작성자</b></font></td>
		       <td align=center width=170 bgcolor=lightgray><font color=blue><b>작성일</b></font></td>
		       <td align=center width=170 bgcolor=lightgray><font color=blue><b>내용</b></font></td>
		    </tr>
			<%
				//게시 등록일을 2010-3-15 10:33:21 형태로 출력하기 위한 클래스 
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				for( GuestBean brd : list ) {

			%>
		    <tr> 
				<!-- 수정과 삭제를 위한 링크로 id를 전송 -->
		       <td align=center><%= brd.getGb_num()%></td>
		       <td align=center><%= brd.getGb_name() %></td>
				<!-- 게시 작성일을 2010-3-15 10:33:21 형태로 출력 -->
		       <td align=center><%= df.format(brd.getGb_date()) %></td>
		       <td align=center><%= brd.getGb_content() %></td>
			     <td>
			  		<input class="btn btn-primary" type=button value="수정" onClick="location.href='guest_edit_form.jsp?gb_num=<%=brd.getGb_num()%>'">
			  	</td>
			  	<td>
			  		<form name=boardForm method=post action="guestbook_control.jsp" >
						<!-- 수정:  게시 id를 hidden으로 전송 -->
						<input type=hidden name="gb_num" value=<%=brd.getGb_num() %>>
						<input type=hidden name="menu" value="delete">
			    	<input class="btn btn-danger" type=button value="삭제" onClick="deleteConfirm(<%=brd.getGb_num()%>)"> 
			    	</form>
				 </td>
			    </tr> 
			<%
			    }  
			%>
			</table>
		<% 	}
		%>
		
		<hr width=80%>
		<p>조회된 게시판 목록 수가 <%=counter%>개 입니다.
		<br><br>
		<form name=form method=post action="guestbook_form.jsp">
		      <input class="btn btn-success" type=submit value="글쓰기"> 
		</form>
		</center>
	</div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>