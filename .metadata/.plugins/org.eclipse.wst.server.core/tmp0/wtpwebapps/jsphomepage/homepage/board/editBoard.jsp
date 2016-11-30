<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="board.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- 파일 boardForm.js : 폼의 각 입력 값이 있는지를 검토하는 함수 구현 -->
<script language=JavaScript src="boardForm.js"></script>
</head>

<body>
	<%
		String name = ""; 
		String email = ""; 
		String title = ""; 
		String content = "";
		String headline = "insert";
		
		String num = request.getParameter("num");
		if (num != null) { 
			int idnum = Integer.parseInt(num);
			
			BoardMgr beandb = new BoardMgr(); 
			BoardBean bean = beandb.getBoard(idnum);  
			name = bean.getName();
			email = bean.getEmail();
			title = bean.getTitle();
			content = bean.getContent();
			headline = "update";
		};
	%>

<h2>게시판 <%=headline %>  </h2> <hr>

<center>
<form name=boardForm method=post action="template.jsp?page=/board/processBoard" >
<!-- 수정:  게시 id를 hidden으로 전송 -->
<input type=hidden name="num" value=<%=num %>>
<input type=hidden name="menu" value="insert">
<table width=700 border=0 cellspacing=0 cellpadding=7>
 <tr>
  <td align=center>
	<table >
		<tr> 
			<td colspan=2>
				<table  width=650>
				    <tr>
					     <td  align=left>이 름: </td>
					     <td align=left>
							<input type=text name=name value="<%=name%>" size=30 maxlength=20></td>
					     <td  align=left>전자메일:</td>
					     <td>
							<input type=text name=email size=30 value="<%=email%>" maxlength=30 ></td>
				    </tr>	
					<tr >
				     <td align=left>제 목: </td>
				     <td colspan=3 align=left>
						<input type=text name=title size=80 value="<%=title%>" maxlength=100></td>
					</tr>
				</table>
			</td> 
		</tr>
	    <tr>
		    <td colspan=2 align=left>
					<textarea name=content rows=10 cols=90><%=content%></textarea></td>
		</tr>
		<tr>
		    <td colspan=2 align=left>비밀번호 :
			     <input type=password name=passwd size=20 maxlength=20><font color=red>  
		         	게시 내용을 수정 또는 삭제하려면 비밀번호가 필요합니다.</font></td>
	    </tr>
		<tr>
	     	<td colspan=2 height=5><hr size=2></td>
	    </tr>
		<tr>
		     <td colspan=2>
				<% if (num == null) { %>	
				 		<input type=button value="등록" onClick="insertCheck()">
				<% } else { %>
		  				<input type=button value="수정완료" onClick="updateCheck()">			    	
				<% } %>
						
				<input type=button value="목록보기" onClick="location.href='template.jsp?page=/board/listBoard'"> 				
			 </td>
	    </tr> 
   	</table> 
   </td>
 </tr> 	 	
</table>
</form>
</center>
</body>
</html>