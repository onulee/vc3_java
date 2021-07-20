<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<%request.setCharacterEncoding("utf-8"); %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		</head>
	<body>
	<h3>param</h3>
	<h3>${param.nickName1 } : param</h3>
	<h3>${param.checkNum } : param</h3>
	<hr>
	
	
	<% int number2=1000; %>
	<c:set var="number" value="<%=number2 %>"  />
	<h3>jstl number변수의 값 : ${number }</h3>
	<h3>스크립트릿 number변수의 값 : ${number2 }</h3>
	<hr>
	<c:set var="check" value="4" />
	<c:choose>
	  <c:when test="${check==1}">
	    <h3>check변수의 값은 1입니다.</h3>
	  </c:when>
	  <c:when test="${check==2}">
	    <h3>check변수의 값은 2입니다.</h3>
	  </c:when>
	  <c:when test="${check==3}">
	    <h3>check변수의 값은 3입니다.</h3>
	  </c:when>
	  <c:otherwise>
	     <h3>잘못된 입력을 하셨습니다.</h3>
	  </c:otherwise>
	
	</c:choose>
	
	
	<hr>
	<c:if test="${param.id != 'bbb' }">
	  <table>
	    <tr>
	      <th>아이디</th>
	      <td>${param.id }</td>
	    </tr>
	    <tr>
	      <th>이름</th>
	      <td>${param.name}</td>
	    </tr>
	</c:if>
	<c:if test="${empty param.id }">
	  <h3>아이디 또는 이름 데이터가 입력되지 않았습니다.</h3>
	</c:if>
	
	<p><a href="./formTest.jsp">formTest페이지로 이동</a></p>
	
	</body>
</html>