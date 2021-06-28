<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>성공</title>
	</head>
	<body>
	  <h3>나이 : <%=request.getParameter("age") %></h3>
	  <h3>출생지 : <%=request.getParameter("place") %></h3>
	  <h3>이름 : <%=request.getParameter("name") %></h3>
	  <h3>담배를 판매해도 됩니다.</h3>
	
	</body>
</html>