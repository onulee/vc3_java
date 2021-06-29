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
	    Cookie[] cookieAll = request.getCookies(); //쿠키 모두 가져옴
	    if(cookieAll != null){ //쿠키 있는지 확인
	    	for(int i=0;i<cookieAll.length;i++){
	    		cookieAll[i].setMaxAge(0);
	    		response.addCookie(cookieAll[i]);
	    	}
	    }
	    
	    response.sendRedirect("./index.jsp");
	  
	  
	  %>
	
	</body>
</html>