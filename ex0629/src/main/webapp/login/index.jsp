<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	
	  <ul>
	    <!-- localhost:8181/ex0629/login/index.jsp -->
	    <%
	       Cookie[] cookieAll = request.getCookies();
	       int count=0;
	       if(cookieAll !=null){ //쿠키가 있는지 확인
	    	   for(int i=0;i<cookieAll.length;i++){
	    		   //닉네임 검색후 닉네임 출력
	    		   if(cookieAll[i].getName().equals("cookie_nName")){
	    			   out.println("<h3>"+cookieAll[i].getValue()+"님 환영합니다.</h3>");
	    		   }
	    		   //아이디 검색후 아이디 출력
	    		   if(cookieAll[i].getName().equals("cookie_id")){
	    			   out.println("<h3>아이디 : "+cookieAll[i].getValue()+"</h3>");
	    		   }
	    		   //로그인성공
	    		   if(cookieAll[i].getName().equals("cookie_flag")){ //로그인된 상태
	    		       count=1;
	    		   %>	   
	    			   <img src="../images/login.jpg">
	    			   <li><a href="./logout.jsp">로그아웃</a></li>
	    			   <li>게시판</li>
	    			   <li>이벤트</li> 
	    		   <%	   
	    		   }//if
	    	   }//for
	       }//if
	       
	       
	       if(count==0){ //로그인이 안된 상태
	       %>
	         <h3>[ 로그인 가능 ]</h3>
	         <img src="../images/logout.jpg">
	         <li><a href="./login.jsp">로그인</a></li>
	       <%	   
	       }
	    %>
	    <li><a href="./index.jsp">index</a></li>
	    <li>공지사항</li>
	  </ul>
	
	</body>
</html>