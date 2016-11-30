<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, ch10.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>검색결과</title>
</head>
<body>
<div align = "center">
<h1> 검색결과 </h1>

<table border = "1">
<tr>
   <td><strong>ID</strong></td>
   <td><strong>PASSWD</strong>
   <td><strong>NAME</strong></td>
   <td><strong>GENDER</strong></td>
   <td><strong>EMAIL</strong></td>
   <td><strong>PHONE</strong></td>
   <td><strong>ZIPCODE/ADDRESS</strong></td>
   <td><strong>JOB</strong></td> 
   <td><strong>수정</strong></td>
   <td><strong>삭제</strong></td>
</tr>
<jsp:useBean id = "regMgr" class = "ch10.RegisterMgrPool" scope = "page" />
<%
 request.setCharacterEncoding("euc-kr");//인코딩 설정
 Vector<RegisterBean> vlist = regMgr.getSearchMemberList(request.getParameter("searchName"));
 //검색한 이름에 해당하는 회원정보 벡터배열에 담기
 
 int counter = vlist.size();System.out.println(counter);
 //동명이인이 있을 수 있음
%>
 <tr>
<%
 for(int i=0; i<vlist.size(); i++){
    RegisterBean regBean = (RegisterBean)vlist.get(i);
 %> 
  <td><%=regBean.getId()%></td>
  <td><%=regBean.getPasswd() %></td>
  <td><%=regBean.getName()%></td>
  <td><%=regBean.getGender() %></td>
  <td><%=regBean.getEmail()%></td>
  <td><%=regBean.getPhone()%></td>
  <td><%=regBean.getZipcode()%>/<%=regBean.getAddress()%></td>
  <td><%=regBean.getJob()%></td>
  <td><a href = "modifyMember.jsp?id=<%=regBean.getId() %>">수정</a></td>
  <td><a href = "deleteMember.jsp?id=<%=regBean.getId() %>"
      onclick = "return confirm('정말 삭제하시겠습니까?');">삭제</a></td>
 </tr>
   </table>
  <br/><br/>
 <%
 }
 %>
 total records : <%= counter %><%-- 해당 검색한 이름에 대한 동명이인까지 행의 개수 --%>
<form method = "post" action = "searchMember.jsp">
이름 검색  : <input type = "text" name = "searchName"> <input type = "submit" value = "검색">
</form>
</div>
</body>
</html> 