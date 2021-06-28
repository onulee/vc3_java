<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result.jsp</title>
		<style type="text/css">
		  table,td{border:1px solid black; border-collapse: collapse;}
		
		</style>
	</head>
	<body>
	  <h3>result.jsp</h3>
	  <table>
	  <% request.setCharacterEncoding("utf-8"); %>
	    <tr>
	      <td>아이디</td>
	      <td><%=request.getParameter("id") %></td>
	    </tr>
	    <tr>
	      <td>패스워드</td>
	      <td><%=request.getParameter("pw") %></td>
	    </tr>
	    <tr>
	      <td>이름</td>
	      <td><%=URLDecoder.decode(request.getParameter("name"),"utf-8") %></td>
	      
	    </tr>
	  </table>
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	</body>
</html>