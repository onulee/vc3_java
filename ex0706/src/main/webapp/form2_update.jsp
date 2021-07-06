<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>수정페이지</title>
	</head>
	<body>
	  <%
	    request.setCharacterEncoding("utf-8");
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    String name = request.getParameter("name");
	    String gender = request.getParameter("gender");
	  %>
	  <h3>회원정보 수정</h3>
	  <form action="./formOk2.jsp" method="post" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id" value="<%=id %>"><br>
	    <label>패스워드</label>
	    <input type="text" id="pw" name="pw" value="<%=pw %>"><br>
	    <label>이름</label>
	    <input type="text" id="name" name="name" value="<%=name %>"><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="male"
	     <%=(gender.contains("male"))?"checked":"" %>>남자
	    <input type="radio" id="female" name="gender" value="female"
	     <%=(gender.equals("female"))?"checked":"" %>>여자<br>
	    <input type="submit" value="저장"><br>
	  
	  
	  </form>
	
	</body>
</html>