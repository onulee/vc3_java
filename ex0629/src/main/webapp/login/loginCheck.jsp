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
	     String id = request.getParameter("id");
	     String pw = request.getParameter("pw");
	     
	     if(id.equals("aaa") && pw.equals("1234")){
             //Cookie 선언
	    	 Cookie cookie_id = new Cookie("login_id","aaa");
	    	 Cookie cookie_nName = new Cookie("cookie_nName","쿠키닉네임");
	    	 Cookie cookie_flag = new Cookie("cookie_flag","success");
	    	 // 시간설정
	    	 cookie_id.setMaxAge(1800);
	    	 cookie_nName.setMaxAge(1800);
	    	 cookie_flag.setMaxAge(1800);
	    	 // 사용자컴퓨터 쿠키를 저장
	    	 response.addCookie(cookie_id);
	    	 response.addCookie(cookie_nName);
	    	 response.addCookie(cookie_flag);
	    	 response.sendRedirect("./index.jsp");
	     }else{
	    	 response.sendRedirect("./login.jsp?login_flag=fail");
	     }
	     
	  
	  
	  %>
	
	
	
	</body>
</html>