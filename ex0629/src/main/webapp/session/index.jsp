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
	     //섹션 가져오기
	     String session_flag = (String)session.getAttribute("session_flag");
	     //섹션이 있는지 확인
	     if(session_flag !=null){
		     //로그인성공시
		     if(session_flag.equals("success")){
		     %>
		       <a href="logout.jsp"><img src="../images/login.jpg"></a> 
		     <%
		     }
	     }else{%>	 
		   	<a href="login.jsp"><img src="../images/logout.jpg"></a> 
		 <%}%>
	     
	     
	     
	     
	   
	</body>
</html>