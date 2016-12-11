<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="guestbook.*" %>
<!DOCTYPE HTML>
<head>
<meta charset="UTF-8"/>
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
<script src="../boardForm.js"></script>
<link href="../style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	<div id="content">
			<%
			
			String gb_num = request.getParameter("gb_num");
			
		String gb_name = ""; 
		String gb_content = "";
		String gb_headline = "insert";
		
	
		
		if (gb_num != null) { 
			int idnum = Integer.parseInt(gb_num);
			
			GuestMgr beandb = new GuestMgr(); 
			GuestBean bean = beandb.getBoard(idnum);  
			gb_name = bean.getGb_name();
			gb_content = bean.getGb_content();
			gb_headline = "update";
		};
	%>

	<h2>방명록 <%=gb_headline %>  </h2> <hr>
	
	<center>
	<form name=boardForm method=post action="guestbook_control.jsp" >
	<!-- 수정:  게시 id를 hidden으로 전송 -->
	<input type=hidden name="gb_num" value=<%=gb_num %>>
	<input type=hidden name="menu" value="insert">
	<table width=700 border=0 cellspacing=0 cellpadding=7>
	 <tr>
	  <td align=center>
		<table >
			<tr> 
				<td colspan=2>
					<table  width=650>
					    <tr>
						     <td  align=left>이 름:</td>
						     <td align=left>
								<input type=text name=gb_name value="<%=gb_name%>" size=30 maxlength=20></td>
					    </tr>	
					</table>
				</td> 
			</tr>
		    <tr>
			    <td colspan=2 align=left>
						<textarea name=gb_content rows=5 cols=100><%=gb_content%></textarea></td>
			</tr>
			<tr>
			    <td colspan=2 align=left>비밀번호 :
				     <input type=password name=gb_passwd size=20 maxlength=20><font color=red>  
			         	게시 내용을 수정 또는 삭제하려면 비밀번호가 필요합니다.</font></td>
		    </tr>
			<tr>
		     	<td colspan=2 height=5><hr size=2></td>
		    </tr>
			<tr>
			     <td colspan=2>
					<% if (gb_num == null) { %>	
					 		<input type=button value="등록" onClick="insertCheck()">
					<% } else { %>
			  				<input type=button value="수정완료" onClick="updateCheck()">			    	
					<% } %>	
				 </td>
		    </tr> 
	   	</table> 
	   </td>
	 </tr> 	 	
	</table>
	</form>
	</center>
	</div>
	<div id="foot">
		<jsp:include page="/homepage/foot.jsp" />
	</div>
</center>
</body>
</html>