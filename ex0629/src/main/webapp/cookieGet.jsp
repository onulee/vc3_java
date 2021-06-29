<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookieGet</title>
	</head>
	<body>
	  <%
	    Cookie[] cookieAll = request.getCookies(); //현재 쿠기 모든것을 가져옴. 
	    for(int i=0;i<cookieAll.length;i++){
	    	String cookieName = cookieAll[i].getName(); //key값 가져옴
	    	String cookieValue = cookieAll[i].getValue(); //value값 가져옴
	    	
	    	out.println("쿠키 : "+cookieName+",");
	    	out.println(cookieValue+"<br>");
	    	
	    	if(cookieAll[i].getValue().equals("success")){
	    		out.println("로그인이 되었습니다.");
	    	}
	    }
	    
	    //삭제
	    for(int i=0;i<cookieAll.length;i++){
	    	//cookieAll[i].setMaxAge(0); 쿠키모두삭제
	    	if(cookieAll[i].getName().equals("cookie_flag")){
	    		cookieAll[i].setMaxAge(0); //1개 쿠키삭제
	    		response.addCookie(cookieAll[i]); //최종 user컴퓨터에 쿠키저장
	    	}
	    }
	    
	    
	    
	  %>
	  
	  <a href="cookieDel.jsp">쿠키삭제확인</a>
	  
	
	</body>
</html>