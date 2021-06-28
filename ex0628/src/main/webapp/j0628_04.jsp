<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%! 
	    String id="aaa";
	    String pw="1111";
	    String name="김구"; 
		//String name=URLEncoder.encode("김구","utf-8");
	%>
	<head>
	<meta charset="UTF-8">
	<title>j0628_04.jsp</title>
	
	<script type="text/javascript">
	   function sendLink(){
		   alert("테스트");
		   location.href="result.jsp?id=<%=id%>&pw=<%=pw%>&name=<%=name%>";
	   }
	</script>
	</head>
		<body>
		<!-- result.jsp sendRedirect사용,파라미터 방식으로 데이터 전달 -->
		<%
		  //response.sendRedirect("result.jsp?id="+id+"&pw="+pw+"&name="+name);
		%>
		<!--  
		<a href="result.jsp?id=<%=id%>&pw=<%=pw%>&name=<%=name%>">데이터전송</a>
		-->
		<button type="button" onclick="sendLink()">파라미터전송</button>
		</body>
</html>