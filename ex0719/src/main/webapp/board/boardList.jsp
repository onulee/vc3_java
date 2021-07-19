<%@page import="com.site.ex0719.BDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.site.ex0719.BDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>board 리스트</title>
		<style type="text/css">
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<%
	  BDao bDao = new BDao();
	  ArrayList<BDto> list = new ArrayList();
	  list = bDao.boardList();
	
	%>	
	<body>
	  <h3>게시판 리스트</h3>
	  <span><a href="../index.jsp">메인으로</a></span>
	  <table>
	    <tr>
	      <th>번호</th>
	      <th>제목</th>
	      <th>파일명</th>
	      <th>작성자</th>
	      <th>작성일</th>
	      <th>조회수</th>
	    </tr>
	    <% for(int i=0;i<list.size();i++){ 
	       BDto bDto = list.get(i);
	    %>
		    <tr>
		      <td><%=bDto.getBid() %></td>
		      <td><%=bDto.getBtitle() %></td>
		      <td><%=bDto.getBupload() %></td>
		      <td><%=bDto.getBname() %></td>
		      <td><%=bDto.getBdate() %></td>
		      <td><%=bDto.getBhit() %></td>
		    </tr>
	    <%}%>
	  </table>
	
	
	</body>
</html>