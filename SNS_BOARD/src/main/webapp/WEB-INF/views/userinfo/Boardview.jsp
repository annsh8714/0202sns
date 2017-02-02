<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
var flag=1;

function commentBtn(){

	if(flag==1){
		document.getElementById("comment").style.display='block';
		flag=2;
	}
	else if(flag==2){
		document.getElementById("comment").style.display='none';
		flag=1;
	}
}
	
function replyBtn(){

	if(flag==1){
		document.getElementById("reply").style.display='block';
		flag=2;
	}
	else if(flag==2){
		document.getElementById("reply").style.display='none';
		flag=1;
	}
}
function getreplyBtn(){
		document.form1.action = "reply";
		document.form1.submit();
}
</script>
<title>POST</title>

</head>
<body>
<form method = 'post' name = 'form1'>

<c:forEach var="pst" items="${post}">
<div id="post"> 사진, ${pst.member_name}
				<div id="board_view">
					<div id="text_line">
						<input type = "textbox" name = "bcontent" id = "bcontent" value = "${pst.bcontent}" style="border:0" readonly>
						<a href="javascript:void(0);"><img src="${pst.pdic}" alt="제목없음"></a>																					
					</div>
					
					
				</div>
			</div>
</c:forEach>
					<input type = 'button' value = "댓글펼치기" onclick = "commentBtn()">		
					<button id="photo_attach_button">좋아요
					</button>
					<input type = 'button' value = "댓글달기" onclick = "replyBtn()">		
					<button id="photo_attach_button">공유하기
					</button>

<div id="comment" style="display:none;">
<c:forEach var="cmt" items="${comment}">
<table>
  <tr>
     <th align = "left"><input type = "text" name = "member_name" id = "member_name" value = "${cmt.member_name}" style="border:0" readonly> </th>
     <th><input type = "text" name = "reply1" id = "reply1" value = "${cmt.ccontent}" style="border:0" readonly></th>
     <th><input type = "text" name = "writedate" id = "writedate" value = "${cmt.writedate}" style="border:0" readonly></th>
  </tr>
</table>
</c:forEach>
</div>

<div id="reply" style="display:none;">
<input type = hidden name = "bno"  value ="1">
<input type = hidden name = "uno"  value ="1">
<input type = "textbox" name="ccontent" id="ccontent">
<input type = "button" value = "게시" onclick = "getreplyBtn()">
</div>

</form>

</body>

</html>