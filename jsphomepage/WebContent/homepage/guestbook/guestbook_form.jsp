<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ page import="guestbook.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script
src="https://code.jquery.com/jquery-3.1.1.min.js"
integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script language=JavaScript src="../boardForm.js"></script>
<link href="style.css" rel="stylesheet" type="text/css"> 
</head>
<body>
<center>
	<div class="wrapper">
		<jsp:include page="/homepage/head.jsp" />
	<div id="content">
	
<%
		String gb_headline = "insert";
		
		String num = request.getParameter("gb_num");
		if (num != null) { 
			int idnum = Integer.parseInt(num);
			
			GuestMgr beandb = new GuestMgr(); 
			GuestBean bean = beandb.getBoard(idnum);  
		};
%>
        <h1>방명록 : <%=gb_headline %></h1>
        <form name="boardForm" method="post" action="guestbook_control.jsp">
            <input type=hidden name="gb_num" value=<%=num %>>
			<input type=hidden name="menu" value="insert">
            
            <table cellpadding="5" cellspacing="0" border="1">
                <tr>
                    <td bgcolor="#99CCFF">작 성 자</td>
                    <td><input type="text" name="gb_name" size="30"  maxlength="20"></td>
                </tr>
                           
                <tr>
                    <td bgcolor="#99CCFF">비밀번호</td>
                    <td><input type="password" name="gb_passwd" size="20" maxlength="20"></td>
                </tr>
                
                <tr>
                    <td colspan="2"><textarea rows="5" name="gb_content" cols="40"></textarea></td>
                </tr>
                
                <tr>
                     <td colspan=2>
					<% if (num == null) { %>	
					 		<input type=button value="등록" onClick="insertCheck()">
					<% } else { %>
			  				<input type=button value="수정완료" onClick="updateCheck()">			    	
					<% } %>
							
					<input type=button value="목록보기" onClick="location.href='guestbook_list.jsp'"> 				
				 </td>
                </tr>
</table>
</form>
</div>
<div id="foot">
<jsp:include page="/homepage/foot.jsp" />
</div>
</center>
</body>
</html>
