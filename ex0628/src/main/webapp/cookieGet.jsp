<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie get</title>
	</head>
	<body>
	  <%
	     Cookie[] cookies = request.getCookies();
	     for(int i=0;i<cookies.length;i++){
	    	 String cookName = cookies[i].getName(); // Cookie저장되어 있는 모든 이름을 가져옴
	    	 String cookValue = cookies[i].getValue(); // Cookie저장되어 있는 모든 이름을 가져옴
	    	 out.println("쿠키이름 : "+cookName+",");
	    	 out.println("쿠키값 : "+cookValue+"<br>");
	    	 if(cookName.equals("login_id")){
	    		 out.println("login_id=aaa 쿠기가 존재합니다."+"<br>");
	    	 }
	     }
	  
	  
	  %>
	
	</body>
</html>