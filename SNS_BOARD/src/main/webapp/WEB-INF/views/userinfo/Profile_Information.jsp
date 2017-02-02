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
<title>PROFILE</title>

</head>
<body>
<form method = 'post' action = 'modifying' name = 'form1'>
<h1>PROFILE INFORMATION</h1>

<div id="pro" >
 <table>
  <tr>
   <th align = "left">NAME  </th>
    <th><input type = "text" name = "member_name" id = "member_name" value = "${userinfo.member_name}" style="border:0" readonly> </th>
  </tr>
   <tr>
   <th align = "left">BIRTH  </th>
    <th><input type = "text" name = "member_birth" id = "member_birth" value = "${userinfo.member_birth}" style="border:0" readonly> </th>
  </tr>
  <tr>
   <th align = "left">SEX  </th>
    <th><input type = "text" name = "member_sex" id = "member_sex" value = "${userinfo.member_sex}" style="border:0" readonly> </th>
  </tr>
  <tr>
   <th align = "left">E_MAIL  </th>
    <th><input type = "text" name = "member_email" id = "member_email" value = "${userinfo.member_email}" style="border:0" readonly> </th>
  </tr>
  <tr>
   <th align = "left">PHONE NUMBER  </th>
    <th><input type = "text" name = "member_phone" id = "member_phone" value = "${userinfo.member_phone}" style="border:0" readonly> </th>
  </tr>
  <tr>
   <th align = "left">JOIN DATE  </th>
    <th><input type = "text" name = "member_join" id = "member_join" value = "${userinfo.member_join}" style="border:0" readonly> </th>
  </tr>
  <tr>
   <th align = "left">PRIVACY  </th>
    <th><input type = "text" name = "member_privacy" id = "member_privacy" value = "${userinfo.member_privacy}" style="border:0" readonly> </th>
  </tr>
</table>
</div>
<div>
<input type = "button" name = "modify" id = "modify" value = "Modify" onclick ="modifyBtn()">
</div>
</form>

</body>

</html>