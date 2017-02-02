<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>


</script>
<title>ALARM</title>

</head>
<body>

<h1>ALARM LIST</h1>


<div id="alm" >
<c:forEach var="evt" items="${event}">
<table>
  <tr>
     <th align = "left"><input type = "text" name = "username1" id = "username1" value = "${evt.username1}" style="border:0" readonly>님이 </th>
     <th><input type = "text" name = "username2" id = "username2" value = "${evt.username2}" style="border:0" readonly>에게</th>
     <th><input type = "text" name = "eventtype" id = "eventtype" value = "${evt.eventtype}" style="border:0" readonly></th>
  </tr>
</table>
</br>
</c:forEach>
</div>

</body>

</html>