<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form2</title>
	</head>
	<body>
	  <h3>회원가입</h3>
	  <form action="./formOk2.jsp" method="post" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id"><br>
	    <label>패스워드</label>
	    <input type="text" id="pw" name="pw"><br>
	    <label>이름</label>
	    <input type="text" id="name" name="name"><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="male" >남자
	    <input type="radio" id="female" name="gender" value="female">여자<br>
	    <input type="submit" value="저장">
	    <input type="reset" value="취소"><br>
	  
	  
	  </form>
	
	</body>
</html>