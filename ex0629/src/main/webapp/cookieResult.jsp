<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result</title>
	</head>
	<body>
	  <%
	    Cookie[] cookieAll = request.getCookies();
	    
	    if(cookieAll!=null){  //null이 아닐때
		    for(int i=0;i<cookieAll.length;i++){
		    	out.println("쿠키 : "+ cookieAll[i].getName()+",");	
		    	out.println(cookieAll[i].getValue()+"<br>");
		    }
	    }else{
	    	out.println("쿠키가 존재하지 않습니다.");
	    }
	  
	  %>
	
	</body>
</html>