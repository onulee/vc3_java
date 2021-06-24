<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>for문 적용</title>
		<style type="text/css">
		  table,td,th{ border:1px solid black; border-collapse: collapse; 
		    text-align: center; 
		  }
		  
		  td{width:100px;}
		  
		  
		</style>
	</head>
	<body>
	<!-- html주석 : 소스보기하면 보입니다.  -->
	
	  <table>
	    <tr>
	      <th>번호</th>
	      <th>결과값</th>
	    </tr>
	<%-- jsp주석 : 1에서 100까지 합의 결과표시 --%>
	<%
	   int sum=0;
	   for(int i=1;i<=100;i++){
		   sum = sum + i;
	%>	   
	    <tr>
	      <td>
	        <% out.println(i); %>
	      </td>
	      <td>
	        <% out.println(sum); %>
	      </td>
	    </tr>
	<%   
	   }
	%>
	  
	  </table>
	
	</body>
</html>