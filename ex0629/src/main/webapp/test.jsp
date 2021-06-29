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
	     String id="aaa";
	     String pw="1234";
	     if(id.equals("aaa") && pw.equals("1234")){
	  %>
	    <script type="text/javascript">
	       alert("html코드를 넣으려면 스크립트릿을 분리해야 합니다.");
	    </script>	 
	  <%}else{%> 	 
	    <script type="text/javascript">
	      alert("두번째 html코드 분리");
	    </script>	 
	  <%}%>
	
	</body>
</html>