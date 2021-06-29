<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <!-- index 로그인전,로그인후 -> login.jsp -> 
	    loginCheck.jsp,session저장 -> 
	  index.jsp -> logout.jsp -->
	  
	  <!-- 
	  
	    [ 최초페이지 ]
		index.jsp(로그인전) 
		- 로그인 안된 이미지가 보여짐.
		- 클릭시 -> login.jsp
		
		login.jsp
		- form데이터 id,pw를 넣고 loginCheck.jsp페이지 이동
		
		loginCheck.jsp
		- id,pw값을 request.getParameter 변수에 적용시킴
		- id,pw를 체크해서 맞으면 -> session값 적용시키고 index.jsp보냄.
		- id,pw를 체크해서 맞지 않으면 -> login.jsp페이지로 이동
		
		index.jsp(로그인후)
		- 로그인 된 이미지를 보여줌.
		- 클릭시 -> logout.jsp
		
		logout.jsp
		- session.invalidate() 모든 섹션 삭제
		- index.jsp 페이지로 이동
	  
	  
	   -->
	  
	  
	
	</body>
</html>