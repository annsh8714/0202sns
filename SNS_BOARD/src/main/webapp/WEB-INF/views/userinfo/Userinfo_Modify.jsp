<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>

function completeBtn(){
	document.form1.submit();
} 
</script>
<title>PROFILE</title>

</head>
<body>
<form method = 'post' action = 'complete' name = 'form1'>
<h1>PROFILE INFORMATION</h1>
<input type = "hidden" value = "${userinfo.member_no}" name = "member_no">
<div id="pro" >
 <table>
  <tr>
   <th align = "left">NAME  </th>
    <th><input type = "text" name = "member_name" id = "member_name" value = "${userinfo.member_name}"> </th>
  </tr>
   <tr>
   <th align = "left">BIRTH  </th>
    <th><input type = "text" name = "member_birth" id = "member_birth" value = "${userinfo.member_birth}"> </th>
  </tr>
  <tr>
   <th align = "left">SEX  </th>
    <th><input type = "text" name = "member_sex" id = "member_sex" value = "${userinfo.member_sex}"> </th>
  </tr>
  <tr>
   <th align = "left">E_MAIL  </th>
    <th><input type = "text" name = "member_email" id = "member_email" value = "${userinfo.member_email}"> </th>
  </tr>
  <tr>
   <th align = "left">PHONE NUMBER  </th>
    <th><input type = "text" name = "member_phone" id = "member_phone" value = "${userinfo.member_phone}"> </th>
  </tr>
  <tr>
   <th align = "left">JOIN DATE  </th>
    <th><input type = "text" name = "member_join" id = "member_join" value = "${userinfo.member_join}"> </th>
  </tr>
  <tr>
   <th align = "left">PRIVACY  </th>
    <th><input type = "text" name = "member_privacy" id = "member_privacy" value = "${userinfo.member_privacy}"> </th>
  </tr>
  
</table>
</div>
<div>
<input type = "button" name = "uname_mo" id = "uname_mo" value = "Complete" onclick = "completeBtn()">
</div>
</form>
</body>

</html>