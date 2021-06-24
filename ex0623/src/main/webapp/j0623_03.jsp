<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>배열활용</title>
		<style type="text/css">
		    table,td,th{ border:1px solid black; border-collapse: collapse; 
		    text-align: center; 
		  }
		</style>
	</head>
	<body>
	  <%
	      String[] name={"홍길동","이순신","유관순","강감찬","김구"};
	      int[] stuNo={1,2,3,4,5};
	      int[][] score={{100,100,100,300},{100,100,100,300},{100,100,100,300},{100,100,100,300},{100,100,100,300}};
	      double[] avg = { 100.0,100.0,100.0,100.0,100.0};
	  %>
	
	  <table>
	     <tr>
	       <td>번호</td>
	       <td>이름</td>
	       <td>국어</td>
	       <td>영어</td>
	       <td>수학</td>
	       <td>합계</td>
	       <td>평균</td>
	     </tr>
	     
	     <%for(int i=0;i<score.length;i++){%>
		     <tr>
		       <td><%out.println(stuNo[i]); %></td>
		       <td><%out.println(name[i]); %></td>
	        	<% for(int j=0;j<score[i].length;j++){%>
			       <td><% out.println(score[i][j]);%></td>
	        	<%}%>
		       <td><%out.println(avg[i]); %></td>
		     </tr>
	     <%}%>
	  
	  </table>
	
	
	
	</body>
</html>