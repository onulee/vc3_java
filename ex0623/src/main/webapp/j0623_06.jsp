<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		  table,td,th{ border:1px solid black; border-collapse: collapse; 
		    text-align: center; 
		  }
		  
		  td{width:100px;}
		
		</style>
		</head>
	<body>
	   
	   <table>
	     <tr>
	       <td>번호</td>
	       <td>결과값</td>
	     </tr>
	   <%
	      int sum=0;
	      for(int i=0;i<=100;i++){
	    	  sum = sum + i;
	   %>
	     <tr>
	       <td><%= i %></td>
	       <td><%= sum %></td>
	     </tr>
	   <%}%>
	   
	   </table>
	
	
	
	</body>
</html>