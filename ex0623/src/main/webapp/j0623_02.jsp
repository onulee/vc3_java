<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>for문</title>
		<style type="text/css">
		    table,td,th{ border:1px solid black; border-collapse: collapse; 
		    text-align: center; 
		  }
		</style>
	</head>
	<body>
	   <table>
	     <tr>
	       <th>번호</th>
	       <th>제목</th>
	       <th>작성자</th>
	       <th>조회</th>
	     </tr>
	     <% for(int i=1;i<40;i=i+4){ %>  
	     <tr>
	       <td><%out.println(i);%></td>
	       <td><%out.println((i+1)); %></td>
	       <td><%out.println((i+2)); %></td>
	       <td><%out.println((i+3)); %></td>
	     </tr>
	     <%}%>
	   </table>
	
	
	</body>
</html>