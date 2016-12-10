<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="guestbook.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 게시의 등록, 수정을 위해  자바빈즈 이용 선언-->
	<jsp:useBean id="brd" class="guestbook.GuestBean" scope="page" /> 
	    
	<% 
		GuestMgr brddb = new GuestMgr();
		request.setCharacterEncoding("euc-kr");
	 	String menu = request.getParameter("menu"); 
		
	 	if (menu.equals("update") ) { 
			String gb_num = request.getParameter("gb_num");
			String gb_passwd = request.getParameter("gb_passwd");
			int inum = Integer.parseInt(gb_num);	
			    
			if ( !brddb.isPasswd(inum, gb_passwd) ) {
	%>
				<!-- 암호가 틀리면 이전 화면으로 이동 -->
				<script>alert("비밀번호가 다릅니다."); history.go(-1);</script>
	<%
			} else {
	%>
					<jsp:setProperty name="brd" property="gb_num" />
					<jsp:setProperty name="brd" property="gb_name" />
					<jsp:setProperty name="brd" property="gb_content" />

	<%					
					brddb.updateBoard(brd);				
					response.sendRedirect("guestbook_list.jsp");					 		
			}
	 	} else if ( menu.equals("insert") ) {  
	%>
			<jsp:setProperty name="brd" property="gb_name" />
			<jsp:setProperty name="brd" property="gb_content" />
			<jsp:setProperty name="brd" property="gb_passwd" />

	<%				
			brddb.insertBoard(brd);
			response.sendRedirect("guestbook_list.jsp");					 		
	 	}
	%>
</body>
</html>