<%@page import="java.net.URLEncoder"%>
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
	     //URLEncoder.encode(request.getParameter("name"),"utf-8");
	     String name = URLEncoder.encode(request.getParameter("name"),"utf-8");
	     String place = URLEncoder.encode(request.getParameter("place"),"utf-8");
	     int year = Integer.parseInt(request.getParameter("birth"));
	     int age = 2021-year+1; //나이계산 2021-2000+1=22
	     if(age>=20){
	    	 response.sendRedirect("success.jsp?age="+age+"&name="+name+"&place="+place);
	     }else{
	    	 response.sendRedirect("fail.jsp?age="+age+"&name="+name+"&place="+place);
	    	 // fail.jsp?age=19
	     }
	  
	  
	  
	  
	  %>
	
	</body>
</html>