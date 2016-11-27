<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align=center>
<h1>회원 가입</h1>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script.js"></script>
<script type="text/javascript">
	function idCheck(id) {
		frm = document.regFrm;
		if(id=="") {
			alert("아이디를 입력하세요.");
			frm.id.focus();
			return;
		}
		url = "idCheck.jsp?id=" + id;
		window.open(url, "IDCheck", "width=300, heigth=150");
	}
	
	function zipCheck() {
		url = "zipCheck.jsp?check=y";
		window.open(url, "ZipCodeSearch", "width=500, height=300, scrollbars=yes");
	}
</script>
	<form name=memberFrm  method="post" action="memberProc.jsp">
		<table border=1 cellpadding=7 cellspacing=0 >
			<tr>
				<td bgcolor=lightyellow>아이디 </td>
    			<td align=left><input type="text" name="id"  maxlength=20>
    			<input type="button" value="ID중복확인" onClick="idCheck(this.form.id.value)">
    			</td>
    		</tr>
			<tr>
				<td bgcolor=lightyellow>패스워드 </td> 
    			<td align=left><input type="password" name="passwd"  maxlength=20></td>
    		</tr>
			<tr>
				<td bgcolor=lightyellow>패스워드 확인 </td> 
  			    <td align=left><input type="password" name="repasswd"  maxlength=20></td>
  			</tr>
			<tr>
				<td bgcolor=lightyellow>이름 </td> 
    			<td align=left><input type="text" name="name"  maxlength=20/></td>
    		</tr>
			<tr>
				<td bgcolor=lightyellow>성별</td>
   				<td align=left><input type="radio" name="gender" value="남자" checked>남자
   				<input type="radio" name="gender" value="여자">여자
   				</td>
   			</tr>
			<tr>
				<td bgcolor=lightyellow>num2 </td>
  				<td align=left><input type="text" name="num2"  maxlength=7 ></td>
  			</tr>
			<tr>
				<td bgcolor=lightyellow>이메일 </td>
  				<td align=left><input type="text" name="email" maxlength=30 size=40></td>
  			</tr>
			<tr>
				<td bgcolor=lightyellow>전화번호 </td>
  				<td align=left><input type="text" name="phone" maxlength=30></td>
  			</tr>
			<tr>
				<td bgcolor=lightyellow>우편번호</td>
   				<td align=left><input type="text" name="zipcode" maxlength=7></td>
   			</tr>
			<tr>
				<td bgcolor=lightyellow>주소 </td>
    			<td align=left><input type="text" name="address" maxlength=30 size=60></td>
    		</tr>
			<tr>
				<td bgcolor=lightyellow>직업</td>
   				<td align=left><input type="text" name="job" maxlength=30 size=40></td>
   			</tr>
			<tr>
				<td colspan=2 align=center><input type="submit" value="회원가입"> 
    			<input type="reset" value="취소"></td> 
    		</tr>
		</table>
	</form>
</div>
</body>
</html>