<%@page import="java.util.ArrayList"%>
<%@page import="com.site.ex0720.BoardVo"%>
<%@page import="com.site.ex0720.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<%
   BoardDao boardDao = new BoardDao();
    ArrayList<BoardVo> list = boardDao.boardAllSelect();
%>
	<head>
		<meta charset="UTF-8">
		<title>게시판 정보</title>
		<style type="text/css">
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	  <h3>ArrayList 정보출력</h3>
	  <table>
	    <tr>
	      <th>번호</th>
	      <th>제목</th>
	      <th>작성자</th>
	      <th>작성일</th>
	      <th>조회수</th>
	    </tr>
	    <!-- 반복시작 -->
        <c:set var="list" value="<%= list %>" />
	    <c:forEach var="boardVo" items="${list}" >
	    
	    <tr>
	      <td>${boardVo.bid }</td>
	      <td>${boardVo.btitle }</td>
	      <td>${boardVo.bname }</td>
	      <td>${boardVo.bdate }</td>
	      <td>${boardVo.bhit }</td>
	    </tr>
	    </c:forEach>
	    <!-- 반복끝 -->
	  </table>
	</body>
</html>