<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		  function formCheck(){
			  alert("폼체크 시작!");
			  //jQuery
			  if($("#memId").val()==""){
				  alert("id를 입력해주세요.");
				  $("#memId").focus();
				  return false;
			  }
			  if($("#pw").val() != $("#pw2").val()){
				  alert("패스워드가 일치하지 않습니다. 다시입력하세요.");
				  $("#pw").val("");
				  $("#pw2").val("");
				  $("#pw").focus();
				  return false;
			  }
			 
			  //javascript
			  if(memberForm.memId.value.length<3){
				  alert("4자리이상 입력하셔야 합니다.");
				  memberForm.memId.focus();
				  return false;
			  }
			  
			  return document.memberForm.submit();
		  }
		
		</script>
	</head>
	<body>
	  <% request.setCharacterEncoding("utf-8"); 
	     String gender = request.getParameter("gender");
	     String hobby = request.getParameter("hobby");
	     String channel = request.getParameter("channel");
	     // male,female
	  %>
	  
	  
	  <h2>회원가입</h2>
	  <form action="./memFormOk.jsp" method="post" name="memberForm"  >
	    <label for="memId">아이디</label>
	    <input type="text" id="memId" name='memId' value='<%=request.getParameter("memId")%>'><br>
	    <label for="pw">패스워드</label>
	    <input type="text" id="pw" name="pw" required="required" value='<%=request.getParameter("pw") %>'><br>
	    <label for="pw2">패스워드확인</label>
	    <input type="password" id="pw2" name="pw2"><br>
	    <label for="name">이름</label>
	    <input type="text" id="name" name="name" value='<%=request.getParameter("name") %>'><br>
	    
	    <label>성별</label><br>
	    <input type="radio" id="male" name="gender" value="남자" <%= (gender.contains("남자"))?"checked":""  %> >
	    <label for="male">남자</label> 
	    <input type="radio" id="female" name="gender" value="여자" <%= (gender.contains("여자"))?"checked":""  %> >
	    <label for="female">여자</label><br>
	    
	    
	    <label>취미</label><br>
	    <input type="checkbox" id="cook" name="hobby" value="cook" <%= (hobby.contains("cook"))?"checked":""  %> >
	    <label for="cook">요리</label>
	    <input type="checkbox" id="run" name="hobby" value="run" <%= (hobby.contains("run"))?"checked":""  %>>
	    <label for="run">조깅</label>
	    <input type="checkbox" id="game" name="hobby" value="game" <%= (hobby.contains("game"))?"checked":""  %>>
	    <label for="game">게임</label>
	    <input type="checkbox" id="read" name="hobby" value="read" <%= (hobby.contains("read"))?"checked":""  %>>
	    <label for="read">독서</label>
	    <input type="checkbox" id="swim" name="hobby" value="swim" <%= (hobby.contains("swim"))?"checked":""  %>>
	    <label for="swim">수영</label><br>
	    <label>유입경로</label>
	    <select name="channel">
	      <option value="internet" <%= (channel.contains("internet"))?"selected":""  %>>인터넷</option>
	      <option value="news" <%= (channel.contains("news"))?"selected":""  %>>신문</option>
	      <option value="advertising" <%= (channel.contains("advertising"))?"selected":""  %>>광고</option>
	      <option value="pamphlet" <%= (channel.contains("pamphlet"))?"selected":""  %>>팜플렛</option>
	    </select><br>
	    <input type="button" onclick="formCheck()" value="수정">
	    <input type="reset" value="취소"><br>
	    
	    
	    
	  
	  
	  
	  
	  </form>
	
	</body>
</html>