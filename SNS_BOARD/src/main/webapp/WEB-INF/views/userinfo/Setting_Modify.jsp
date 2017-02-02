<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>

function modifyBtn(){
	document.form1.submit();
} 

		

</script>
<title>SETTING</title>

</head>
<body>
<form method = 'post' action = 'setcom' name = 'form1'>
<h1>SETTING</h1>
<input type = "hidden" value = "1" name = "member_no">
<div id="set" >
 <table>
  <tr>
   <th align = "left">URL  </th>
    <th>www.sns.com/<input type = "text" name = "member_id" id = "member_id" value = "${userinfo.member_id}" > </th>
  </tr>
   <tr>
   <th align = "left">연락처  </th>
    <th><input type = "text" name = "member_phone" id = "member_phone" value = "${userinfo.member_phone}" > </th>
  </tr>
  <tr>
   <th align = "left">비밀번호  </th>
    <th><input type = "text" name = "member_password" id = "member_password" value = "${userinfo.member_password}" > </th>
  </tr>
  <tr>
   <th align = "left">비활성화  </th>
    <th><input type = "text" name = "unactive" id = "unactive" value = "emepy" > </th>
  </tr>
  <tr>
   <th align = "left">공개설정  </th>
    <th><input type = "text" name = "lockset" id = "lockset" value = "empty" > </th>
  </tr>
 </table>
</div>
<div>
<input type = "button" name = "setcom" id = "setcom" value = "확인" onclick ="modifyBtn()">
</div>
</form>

</body>

</html>