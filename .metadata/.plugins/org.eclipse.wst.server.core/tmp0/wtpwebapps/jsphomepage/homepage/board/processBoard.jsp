<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="board.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 게시의 등록, 수정을 위해  자바빈즈 이용 선언-->
	<jsp:useBean id="brd" class="board.BoardBean" scope="page" /> 
	    
	<% 
		BoardMgr brddb = new BoardMgr();
		request.setCharacterEncoding("euc-kr");
	 	String menu = request.getParameter("menu"); 
		
	 	if (menu.equals("update") ) { 
			String num = request.getParameter("num");
			String passwd = request.getParameter("passwd");
			int inum = Integer.parseInt(num);	
			    
			if ( !brddb.isPasswd(inum, passwd) ) {
	%>
				<!-- 암호가 틀리면 이전 화면으로 이동 -->
				<script>alert("비밀번호가 다릅니다."); history.go(-1);</script>
	<%
			} else {
	%>
					<jsp:setProperty name="brd" property="num" />
					<jsp:setProperty name="brd" property="name" />
					<jsp:setProperty name="brd" property="title" />
					<jsp:setProperty name="brd" property="email" />
					<jsp:setProperty name="brd" property="content" />

	<%					
					brddb.updateBoard(brd);				
					response.sendRedirect("template.jsp?page=/board/listBoard");					 		
			}
	 	} else if ( menu.equals("insert") ) {  
	%>
			<jsp:setProperty name="brd" property="name" />
			<jsp:setProperty name="brd" property="title" />
			<jsp:setProperty name="brd" property="email" />
			<jsp:setProperty name="brd" property="content" />
			<jsp:setProperty name="brd" property="passwd" />


	<%				
			brddb.insertBoard(brd);
			response.sendRedirect("template.jsp?page=/board/listBoard");					 		
	 	}
	%>
</body>
</html>