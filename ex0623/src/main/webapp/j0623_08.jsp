<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <%
	     out.println("컨텍스패스 : "+request.getContextPath()+"<br>");
	     out.println("포트번호 : "+request.getServerPort()+"<br>");
	     out.println("서버 : "+request.getServerName()+"<br>");
	     out.println("요청방식 : "+request.getMethod()+"<br>");
	     out.println("url : " +request.getRequestURL()+"<br>");
	     out.println("url : " +request.getRequestURI()+"<br>");
	     out.println("ip : "+request.getRemoteAddr()+"<br>"); //ipV6방식
	  
	  
	  %>
	  
	  <form action="/a.jsp" method="post" name="memberForm">
	     <input type="text" name="id" value="admin">
	     <input type="checkbox" name="hobby" value="cook" checked>
	     <input type="radio" name="gender" value="male" checked>
	     <select name="protocol">
	        <option value="http" selected>http</option>
	     </select> 
	  </form>
	
	</body>
</html>