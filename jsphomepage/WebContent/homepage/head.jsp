<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	String id = (String) session.getAttribute("idKey");
	String cPath = request.getContextPath();
	String url = "member.jsp";
	String label = "회원가입";
	String board = "/board/listBoard.jsp";
	
		if(id!=null) {
			url = "modifyMember.jsp";
			label = "회원수정";
		}
%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="collapse navbar-collapse" id="navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li>
					<a href="index.jsp">홈</a>
				</li>
				<li>
					<a href="#">공지사항</a>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-haspopup="true" aria-expanded="false" >미드 게시판<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">NCIS</a></li>
						<li><a href="#">왕좌의게임</a></li>
						<li><a href="#">워킹 데드</a></li>
					</ul>
				</li>
				<li>
					<a href="board/listBoard.jsp">자유게시판</a>
				</li>
				<li>
					<a href="#">방명록</a>
				</li>
			</ul>
		</div>
	</div>
</nav>