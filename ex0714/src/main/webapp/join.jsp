<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
	  <%
	     session.setAttribute("id", "aaa");
	  
	  %>
	  <h3>회원가입</h3>
	  <form action="./JoinOk" id="form" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id" placeholder="id는 5자리이상" required ><br>
	    <label>비밀번호</label>
	    <input type="password" id="pw" name="pw" placeholder="pw는 3자리이상" required ><br>
	    <label>이름</label>
	    <input type="text" id="name" name="name"><br>
	    <label>닉네임</label>
	    <input type="text" id="nickName" name="nickName" ><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="male"><label for="male">남자</label>
	    <input type="radio" id="female" name="gender" value="female"><label for="female">여자</label><br>
	    <label>전화번호</label>
	    <input type="text" id="tel" name="tel" ><br>
	    <label>주소1</label>
	    <input type="text" id="address1" name="address1"><br>
	    <label>주소2</label>
	    <input type="text" id="address2" name="address2" ><br>
	    <label>취미</label>
	    <input type="checkbox" id="swim" name="hobby" value="swim"><label for="swim">수영</label>
	    <input type="checkbox" id="golf" name="hobby" value="golf"><label for="golf">골프</label>
	    <input type="checkbox" id="run" name="hobby" value="run"><label for="run">조깅</label>
	    <input type="checkbox" id="read" name="hobby" value="read"><label for="read">독서</label><br>
	    <input type="submit" value="가입완료">
	    <a href="./index.jsp"><input type="button" value="취소"></a><br>
	  
	  </form>
	
	</body>
</html>