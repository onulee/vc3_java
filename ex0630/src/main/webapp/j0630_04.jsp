<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과값</title>
		<style type="text/css">
		  table,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	  <!-- 1. memberForm.jsp - 번호,이름,아이디,전화번호,성별,월급,공제액 -->
	  <!-- 유효성검사 이름:입력했는지, 아이디는 3자리 이상인지? -->
	  <!-- 공제액은 월급에서 10%를 자동으로 계산해서 hidden으로 값을 삽입 -->
	  <!-- 2. salary.java - 번호,이름,아이디,전화번호,성별,월급,공제액(10%) -->
	  <!-- 3. j0630_04.jsp - 폼에서 넘어온 데이터를 useBean에 값을 삽입 -->
	  <!-- 4. useBean 데이터를 테이블에 출력을 하시오. -->
	  
	  <!-- Salary 객체선언 -->
	  <jsp:useBean id="sal" class="ex0630.Salary" scope="page" />
	  <jsp:setProperty name="sal" property="*" />
	  
	  <%-- <jsp:setProperty name="sal" property="no" value="<%=request.getParameter("no") %>" />
	  <jsp:setProperty name="sal" property="name" value="<%=request.getParameter("name") %>" />
	  <jsp:setProperty name="sal" property="id" value="<%=request.getParameter("id") %>" />
	  <jsp:setProperty name="sal" property="tel" value="<%=request.getParameter("tel") %>" />
	  <jsp:setProperty name="sal" property="gender" value="<%=request.getParameter("gender") %>" />
	  <jsp:setProperty name="sal" property="salary" value="<%=request.getParameter("salary") %>" />
	  <jsp:setProperty name="sal" property="tax" value="<%=request.getParameter("tax") %>" /> --%>
	  
	  <table>
	    <tr>
	      <td>번호</td>
	      <td><%=sal.getNo() %></td>
	    </tr>
	    <tr>
	      <td>이름</td>
	      <td><%=sal.getName() %></td>
	    </tr>
	    <tr>
	      <td>아이디</td>
	      <td><%=sal.getId() %></td>
	    </tr>
	    <tr>
	      <td>전화번호</td>
	      <td><%=sal.getTel() %></td>
	    </tr>
	    <tr>
	      <td>월급</td>
	      <td><%=sal.getSalary() %></td>
	    </tr>
	    <tr>
	      <td>공제액</td>
	      <td><%=sal.getTax() %></td>
	    </tr>
	  
	  </table>
	  
	  
	</body>
</html>