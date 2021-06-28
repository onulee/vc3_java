<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	   <form action="rCheck.jsp">
	     <h3>출생년도 나이계산</h3>
	     
	     <label>이름</label>
	     <input type="text" id="name" name="name"><br>
	     <label>출생지(예:서울,경기,부산,인천 등등)</label>
	     <input type="text" id="place" name="place"><br>
	     <label>출생년도를 입력해주세요.(예:1997)</label>
	     <input type="text" id="birth" name="birth"><br>
	     <input type="submit" value="전송">
	   
	   </form>
	</body>
</html>