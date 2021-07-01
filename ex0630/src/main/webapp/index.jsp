<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	  <%
	    String flag = (String)session.getAttribute("session_flag");
		if(flag.equals("success")){
		    out.println("로그인이 되었습니다.<br>");
		}    
	    session.invalidate();  //모두 삭제
	  %>
	
	
	
	</body>
</html>