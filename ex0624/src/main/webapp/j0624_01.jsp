<%@page import="sun.java2d.d3d.D3DRenderQueue"%>
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
	   out.println("getRequestURL : "+request.getRequestURL()+"<br>");
	   out.println("getContextPath : "+request.getContextPath()+"<br>");
	   out.println("getRequestURI : "+request.getRequestURI()+"<br>");
	   out.println("getRequestURI : "+request.getRemoteAddr()+"<br>");
	   
	   //파일명만 출력시켜보세요.subString(5); -> 5부터 끝까지 String 자르시오.
	   String uriName = request.getRequestURI();
	   String pathName = request.getContextPath();
	   out.println("파일 이름 : "+ uriName.substring(pathName.length()));
	
	%>
	
	
	
	</body>
</html>