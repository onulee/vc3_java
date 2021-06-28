<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- 
페이지에서 다른 페이지로 데이터를 전송하는 방법
1. form(get, post-request.setCharactorEncoding("utf-8"))
2. 파라미터 (response.sendRedirect,a태그,자바스크립트)
3. jsp:forward->jsp:param
----
include - 1개:지시자@, 1개:액션태그 jsp:include
 -->
	<head>
		<meta charset="UTF-8">
		<title>jsp:forward-param</title>
	</head>
	<body>
	  <jsp:forward page="result.jsp">
	     <jsp:param name="id" value="admin" />
	     <jsp:param name="pw" value="1234" />
	     <jsp:param name="name" value='<%=URLEncoder.encode("관리자","utf-8") %>' />
	  </jsp:forward>
	
	</body>
</html>