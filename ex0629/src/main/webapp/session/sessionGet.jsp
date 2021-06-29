<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session get</title>
	</head>
	<body>
	  <%
	     //섹션 1개 가져오기
	     String login_id =(String)session.getAttribute("login_id");
	     //섹션 출력
	     out.println("login_id : "+login_id+"<br>");
	     String login_nName =(String)session.getAttribute("login_nName");
	     out.println("login_nName : "+login_nName+"<br>");
	     String login_flag =(String)session.getAttribute("login_flag");
	     out.println("login_flag : "+login_flag+"<br>");

	     //섹션1개삭제
	     session.removeAttribute("login_id");
	     
	     
	     
	     
	  %>
	  
	  <a href="sessionResult1.jsp">섹션결과</a>
	
	</body>
</html>