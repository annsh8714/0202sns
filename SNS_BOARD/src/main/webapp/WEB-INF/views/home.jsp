<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
   <title>MAIN</title>
   <script type="text/javascript">
//성혁
      function add_auc_board() {
          var div = document.createElement('div');
          div.innerHTML = document.getElementById('Auction').innerHTML;
          document.getElementById('Auction_w').appendChild(div);
       }
      
      function ins_auc_board() {
         document.auction_form.action = 'insert';
         document.auction_form.submit();
      }
      
      function search_func() {
         document.search_form.action = 'search';
         document.search_form.submit();
      }
//성준이형
      function selectBtn() {
    	  alert(1);
    	  document.form1.action = "select";
    		document.form1.submit();
    	} 
    function alarmBtn(){
    		document.form1.action = "getevent";
    		document.form1.submit();
    	} 
    	function settingBtn(){
    		document.form1.action = "getsetting";
    		document.form1.submit();
    	}
    	function postBtn(){
    		document.form1.action = "getpost";
    		document.form1.submit();
    	}
//준우
    	function AttachPicture(input){
			window.open('Ex2', 'testWindow', 'width=300, height=300, scrollbars=yes', '_blank');
 			readURL(input); 
 		}

		function readURL(input) {
			document.getElementById("blah").style.display='block';
			document.getElementById("blah2").style.display='block';

            if (input.files && input.files[0]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    document.getElementById("blah").src = e.target.result;
            }
                reader.readAsDataURL(input.files[0]);
            }
            
        }
   </script>
   
   <style>
      #container {
         height:624px;
         width:1280px;
      }
      
      #header {
         background-color:#FFA500;
         height:50px;
      }
      
      #left_side {
         background-color:#FFD700;
         height:550px;
         width:200px;
         float:left;
      }
      
      #left_side_bar {
         background-color:#FFFFFF;
         height:40px;
         width:200px;
         float:left;
         padding:10px;
      }
      
      #center_view {
         background-color:#EEEEEE;
         height:550px;
         width:800px;
         float:left;
      }
      
      #normal_board {
         background-color:#FFFFFF;
         height:500px;
         width:380px;
         float:left;
         margin:10px;
         padding:10px;
      }
      
      #auction_board {
         background-color:#FFFFFF;
         height:500px;
         width:380px;
         float:left;
         margin:10px;
         padding:10px
      }
      
      #board_creator {
         background-color:#BEBEBE;
         height:120px;
         width:360px;
         float:left;
         }
      
      #inside_button {
         background-color:#EEEEEE;
         height:20px;
         width:60px;
         float:left;
         margin:1px;
      }
      
      #text_line {
         background-color:#DCDCDC;
         height:90px;
         width:360px;
         float:left;
      }
      
      #right_side {
         background-color:#FFD700;
         height:550px;
         width:280px;
         float:left;
      }
      
      #footer {
         background-color:#FFA500;
         height:24px;
      }   
      
      #emb {
         backgroud-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #search {
         background-color:#FFFFFF;
         height:30px;
         width:500px;
         float:left;
         margin:5px 5px 5px 5px;
      }
      
      #search_button {
         background-color:#EEEEEE;
         height:30px;
         width:30px;
         float:left;
         margin:5px 5px 5px 5px;
      }
      
      #my_photo {
         background-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
         margin-left:150px;
      }
      
      #home_button {
         background-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #my_button {
         background-color:#FFFFFF;
         height:30px;
         width:50px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #search_friends {
         background-color:#FFFFFF;
         height:30px;
         width:80px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #request_friends {
         background-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #event {
         background-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
      #option {
         background-color:#FFFFFF;
         height:30px;
         width:30px;
         float:left;
         margin:5px;
         padding:10px;
      }
      
   </style>
   
</head>
<body>
   <div id="container">
      <div id="header">
         <div id="emb">
            <b>EMB</b>
         </div>
         <form method='post' name='search_form'>
            <div id="search_board_field">
               <select name="boardfield">
                  <option value="0"> 선택
                  <option value="board"> 일반
                  <option value="auction"> 경매
                  <option value="allcont"> 전체
               </select>
            </div>
            <div id="search_keyfield">
               <select name="keyfield">
                  <option value="0"> 선택
                  <option value="userid"> 작성자
                  <option value="hashtag"> #-태그
               </select>
            </div>
            <div id="search">
               <input id="keyword" type='text' value="SEARCH" name="keyword">
            </div>
            <div id="search_button">
               <input type='button' value="검색" onclick="search_func()">
            </div>
         </form>
         <div id="my_photo">
            <b>M_P</b>
         </div>
         <div id="home_button">
            <b>H_B</b>
         </div>
         <div id="my_button">
            <b>H_B</b>
         </div>
         <div id="search_friends">
            <b>S_F</b>
         </div>
         <div id="request_friends">
            <b>R_F</b>
         </div>
         <div id="event">
            <b>event</b>
         </div>
         <div id="option">
            <b>option</b>
         </div>         
      </div>
		<form method = 'post' name = 'form1'>
		<div id="left_side">
			<b>Left-side</b><br>
			<div id="left_side_bar">
				<b>MYNAME</b>				
			</div>
			<div id="left_side_bar">
				<input type = hidden name = 'member_name' value ="a">
				<input type = 'button' value = "PROFILE UPDATE" onclick = "selectBtn()">				
			</div>
			<div id="left_side_bar">
				<input type = hidden name = 'userno1' value ="1">
				<input type = 'button' value = "EVENT" onclick = "alarmBtn()">				
			</div>
			<div id="left_side_bar">
				<input type = hidden name = 'member_no' value ="1">
				<input type = 'button' value = "SETTING" onclick = "settingBtn()">				
			</div>
		</div>
		</form>
      <div id="center_view">
         <b>Center_view</b>
 		 <div id="normal_board"> NORMAL
			<div id="board_creator">
				<div id="text_line">
					<textarea name="content" rows="5" cols="40" >아무거나 적어보세요.
					</textarea>																						
				</div>
				<button id="photo_attach_button" Style="width:88px;height:25px" Onclick="AttachPicture(this)">사진첨부
				</button>
				<button id="photo_attach_button" Style="width:88px;height:25px" Onclick="HashTag()">태그하기
				</button>
				<button id="photo_attach_button" Style="width:88px;height:25px" Onclick="PrivacyStatus()">공개범위
				</button>
				<button id="photo_attach_button" Style="width:88px;height:25px" Onclick="UploadtoBoard()">게시
				</button>
			</div>
	     </div>
         <div id="auction_board"> AUCTION
            <form method='post' name='auction_form'>
               <div id="board_creator">
                  <div id="text_line">
                     <textarea style="height:90px; width:360px;" name="acontent" id="acontent">아무거나 적으시오.</textarea>                                                       
                  </div>
                  <input id="inside_button" type = button value="사진첨부" onclick="">
                  <input type = text value="시작가" name="initprice" style="width:60px; float:left; margin:1px;">
                  <input type = text value="금액단위" name="priceunit" style="width:60px; float:left; margin:1px;">
                  <select name="" style="float:left">
                     <option> 전체 공개
                     <option> 친구 공개
                     <option> 비 공개
                  </select>
                  <input id="inside_button" type = button value="게시" onclick="ins_auc_board()">
               </div>
            </form>            
            <div>
               <c:forEach var="auction" items="${auctionList}">
                  <p> <b>${auction.ano} </b></p>
                  <textarea style="height:90px; width:360px;" name="acontent" id="aaaaa" readonly>${auction.acontent}</textarea> 
               </c:forEach>            
            </div>
         </div>
      </div>
      <div id="right_side">
         <b>Right_side</b>
      </div>
      <div id="footer" >
         <b>Footer</b>
      </div>
   </div>
</body>
</html>