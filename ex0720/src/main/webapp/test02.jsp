<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl</title>
		<style type="text/css">
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	 
	  <table>
	      <tr>
	        <th>번호</th>
	        <th>제목</th>
	        <th>작성자</th>
	        <th>작성일</th>
	        <th>조회수</th>
	      </tr>
		  <c:forEach var="i" begin="0" end="10" step="1" >
		    <tr>
		      <td><c:out value="${i+1}" /></td>
		      <td>게시판 제목</td>
		      <td>홍길동</td>
		      <td>2021-07-20</td>
		      <td>1</td>
		    </tr>
		  </c:forEach>
	  </table>
	
	</body>
</html>