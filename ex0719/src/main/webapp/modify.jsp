<%@page import="com.site.ex0719.MDto"%>
<%@page import="com.site.ex0719.MDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	    MDao mDao = new MDao();
	    String id = (String) session.getAttribute("session_id");
	    MDto mDto = mDao.memberOneSelect(id); 
%>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		  if(<%= session.getAttribute("session_flag") %>==null){
			  alert("로그인을 하셔야 접근이 가능합니다.");
			  location.href="./login.jsp";
		  }
		
		  function formCheck(){
			 if($("#pw").val()!=<%=mDto.getPw() %>){
				 alert("패스워드가 일치하지 않으면 수정할수 없습니다. 패스워드를 다시 입력해주세요.");
				 $("#pw").focus();
				 return false;
			 } 
			  
			 if($("#id").val().length<3){
				 alert("아이디는 3자리이상 입력하셔야 합니다.");
				 $("#id").focus();
				 return false;
			 } 
			 $("#form").submit();
		  }  
		
		  //jquery
		  $(function(){
			  
		  });
		  
		</script>
	</head>
	<body>
	  
	  
	  <h3>회원정보수정</h3>
	  <form action="./modifyOk.jsp" id="form" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id" value="<%=mDto.getId() %>" readonly><br>
	    <label>비밀번호</label>
	    <input type="password" id="pw" name="pw" > <br>
	    <label>이름</label>
	    <input type="text" id="name" name="name" value="<%=mDto.getName() %>"><br>
	    <label>닉네임</label>
	    <input type="text" id="nickName" name="nickName" value="<%=mDto.getNickName() %>" ><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="male" <%=mDto.getGender().equals("male")?"checked":"" %>><label for="male" >남자</label>
	    <input type="radio" id="female" name="gender" value="female" <%=mDto.getGender().equals("female")?"checked":"" %> ><label for="female" >여자</label><br>
	    <label>전화번호</label>
	    <input type="text" id="tel" name="tel" value="<%=mDto.getTel() %>" ><br>
	    <label>주소1</label>
	    <input type="text" id="address1" name="address1" value="<%=mDto.getAddress1() %>"><br>
	    <label>주소2</label>
	    <input type="text" id="address2" name="address2" value="<%=mDto.getAddress2() %>" ><br>
	    <label>취미</label>
	    <input type="checkbox" id="swim" name="hobby" value="swim" <%= mDto.getHobby().contains("swim")?"checked":"" %>><label for="swim">수영</label>
	    <input type="checkbox" id="golf" name="hobby" value="golf" <%= mDto.getHobby().contains("golf")?"checked":"" %>><label for="golf">골프</label>
	    <input type="checkbox" id="run" name="hobby" value="run" <%= mDto.getHobby().contains("run")?"checked":"" %>><label for="run">조깅</label>
	    <input type="checkbox" id="read" name="hobby" value="read" <%= mDto.getHobby().contains("read")?"checked":"" %>><label for="read">독서</label><br>
	    <input type="button" onclick="formCheck()" value="수정완료">
	    <a href="./index.jsp"><input type="button"  value="취소"></a><br>
	  
	  </form>
	
	</body>
</html>