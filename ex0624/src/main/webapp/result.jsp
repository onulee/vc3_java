<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result</title>
		<style type="text/css">
		  table,td{border:1px solid black; border-collapse: collapse;}
		</style>
		<%!
		   String stuNo,name,kor,eng,math,avg;
		   int total;
		%>
		<%
		    request.setCharacterEncoding("utf-8");
		    stuNo = request.getParameter("stuNo");
		    name = request.getParameter("name");
			kor = request.getParameter("kor");
			eng = request.getParameter("eng");
			math = request.getParameter("math");
		    total =Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
		    avg = String.format("%.2f", total/3.0);
		%>
	</head>
	<body>
	  <h3>학생성적 확인페이지</h3>
	  <table>
	    <tr>
	      <td>학번</td>
	      <td><%=stuNo %></td>
	    </tr>
	    <tr>
	      <td>이름</td>
	      <td><%=name %></td>
	    </tr>
	    <tr>
	      <td>국어</td>
	      <td><%=kor %></td>
	    </tr>
	    <tr>
	      <td>영어</td>
	      <td><%=eng %></td>
	    </tr>
	    <tr>
	      <td>수학</td>
	      <td><%=math %></td>
	    </tr>
	    <tr>
	      <td>합계</td>
	      <td><%=total %></td>
	    </tr>
	    <tr>
	      <td>평균</td>
	      <td><%=avg %></td>
	    </tr>
	  </table>
	  <form action="./modify.jsp">
	    <input type="hidden" name="stuNo" value='<%=stuNo %>'>
	    <input type="hidden" name="name" value='<%=name %>'>
	    <input type="hidden" name="kor" value='<%=kor %>'>
	    <input type="hidden" name="eng" value='<%=eng %>'>
	    <input type="hidden" name="math" value='<%=math %>'>
	    <input type="hidden" name="total" value='<%=total %>'>
	    <input type="hidden" name="avg" value='<%=avg %>'>
	    <input type="submit" value="수정">
	  </form>
	  
	
	</body>
</html>