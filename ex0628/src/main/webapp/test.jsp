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
	     request.setCharacterEncoding("utf-8");
	     String name = request.getParameter("name");
	     String no = request.getParameter("no");
	     int score = Integer.parseInt(request.getParameter("score"));
	     if(score>=60){
	   %>
	     <jsp:forward page="test_success.jsp">
	        <jsp:param name="no" value="<%=no %>" />
	        <jsp:param name="name" value="<%=name %>" />
	        <jsp:param name="score" value="<%=score %>" />
	        <jsp:param name="param_test" value="성공" />
	     </jsp:forward> 	 
	   <% 	//response.sendRedirect("test_success.jsp?no="+no+"&name="+name+"&score="+score);
	     }else{
	    	 //response.sendRedirect("test_fail.jsp?no="+no+"&name="+name+"&score="+score);
	     }
	   %>
	
	</body>
</html>