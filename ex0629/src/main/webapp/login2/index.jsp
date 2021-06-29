<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	  <%
	     //쿠키 모두 가져옴.
	     Cookie[] cookieAll = request.getCookies();
	     int count=0; //로그인 실패 : 0, 로그인 성공: 1
	     
	     //로그인성공시
	     if(cookieAll != null){
	    	for(int i=0;i<cookieAll.length;i++){
	    		//로그인성공시
	    		if(cookieAll[i].getName().equals("c_flag")){
	    		  count=1;
	    		%>	
	    			<a href="./logout.jsp" ><img src="../images/login.jpg"></a>
	    		<%	
	    		}
	    	}
	     }//if
	     
	     // 로그인 실패시
	     if(count==0){
	     %>	 
	    	 <a href="./login.jsp" ><img src="../images/logout.jpg"></a>
	     <%
	     }
	  %>
</html>