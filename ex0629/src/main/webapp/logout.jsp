<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>logout</title>
	</head>
	<body>
	   <%
		  Cookie[] cookieAll = request.getCookies();       
		  for(int i=0;i<cookieAll.length;i++){
		   	//모두삭제 해보기
		 	cookieAll[i].setMaxAge(0); //쿠키모두삭제
		 	response.addCookie(cookieAll[i]);
	      }
		  
		  response.sendRedirect("./main.jsp");
	   
	   %>
	
	</body>
</html>