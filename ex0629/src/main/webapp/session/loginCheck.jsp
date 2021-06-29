<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginCheck</title>
	</head>
	<body>
	  <%
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    //id,pw비교
	    if(id.equals("aaa") && pw.equals("1111")){
	    	//id,pw일치 -> 섹션넣기
	    	session.setAttribute("session_flag", "success");
	    	response.sendRedirect("index.jsp");
	    }else{
	    	//id,pw불일치 ->alert 호출
	    	response.sendRedirect("login.jsp?flag=fail");
	    }
	  
	  
	  
	  %>
	
	</body>
</html>