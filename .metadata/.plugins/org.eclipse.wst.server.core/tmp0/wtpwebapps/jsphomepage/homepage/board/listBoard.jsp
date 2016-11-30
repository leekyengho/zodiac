<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Vector,board.*,java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2>게시판 리스트 </h2>
<hr>  
<center>
	<% 
		BoardMgr brddb = new BoardMgr();	 	
		Vector<BoardBean> list = brddb.getBoardList(); 
	   	int counter = list.size();
	   	int row = 0;
	   	
	   	if (counter > 0) {
	%>
    <table width=800  cellpadding=3 cellspacing=3 >
    
    <tr>
       <th width=60 bgcolor=lightgray><font color=blue><b>번호</b></font></th>
       <th width=430 bgcolor=lightgray><font color=blue><b>제목</b></font></th>
       <th width=80 bgcolor=lightgray><font color=blue><b>작성자</b></font></th>
       <th width=170 bgcolor=lightgray><font color=blue><b>작성일</b></font></th>
       <th width=60 bgcolor=lightgray><font color=blue><b>조회수</b></font></th>
    </tr>
	<%
		//게시 등록일을 2010-3-15 10:33:21 형태로 출력하기 위한 클래스 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for( BoardBean brd : list ) {
			//홀짝으로 다르게 색상 지정
			String color = "papayawhip";
			if ( ++row % 2 == 0 ) color = "white"; 
	%>
    <tr bgcolor=<%=color %> 
		onmouseover="this.style.backgroundColor='SkyBlue'"
    	onmouseout="this.style.backgroundColor='<%=color %>'">
		<!-- 수정과 삭제를 위한 링크로 id를 전송 -->
       <td align=center><%= brd.getNum()%></td>
       <td align=left><a href="template.jsp?page=/board/readBoard?num=<%= brd.getNum()%>"><%= brd.getTitle() %></a></td>
       <td align=center><%= brd.getName() %></td>
		<!-- 게시 작성일을 2010-3-15 10:33:21 형태로 출력 -->
       <td align=center><%= df.format(brd.getRegdate()) %></td>
       <td align=center><%= brd.getHit() %></td>
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
<form name=form method=post action=/board/editBoard.jsp>
      <input type=submit value="글쓰기"> 
</form>
</center>

</body>
</html>