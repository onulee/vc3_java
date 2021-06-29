<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session set</title>
	</head>
	<body>
	  <%
	     //섹션저장
	     session.setAttribute("login_id","aaa");
	     session.setAttribute("login_nName", "섹션스");
	     session.setAttribute("login_flag", "success");
	  %>
	  
	  <a href="./sessionGet.jsp">섹션확인</a>
	
	</body>
</html>