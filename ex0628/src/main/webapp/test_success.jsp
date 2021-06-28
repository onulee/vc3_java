<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>성공</title>
	</head>
	<body>
	  <h3>합격입니다.</h3>
	  <h3>번호 : <%=request.getParameter("no") %></h3>
	  <h3>이름 : <%=request.getParameter("name") %></h3>
	  <h3>점수 : <%=request.getParameter("score") %></h3>
	  <h3>성공여부 : <%=request.getParameter("param_test") %></h3>
	
	</body>
</html>