<%@page import="com.site.ex0720.BoardVo"%>
<%@page import="com.site.ex0720.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%
  BoardDao boardDao = new BoardDao();
  BoardVo boardVo = boardDao.boardOneSelect(Integer.parseInt(request.getParameter("bid")));
%>
<c:set var="boardVo" value="<%=boardVo %>" />
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/read.css">
</head>
<body>
<section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="3">제목</th>
      </tr>
      <tr>
        <td colspan="3"><strong>${boardVo.btitle }</strong></td>
      </tr>
      <tr>
        <td>${boardVo.bname }</td>
        <td>조회수</td>
        <td>${baordVo.bhit }</td>
      </tr>
      <tr>
        <td colspan="3" class="article">${boardVo.bcontent }
        <br>
        <img src="../upload/${boardVo.bupload }">
        </td>
      </tr>
      <tr>
        <td colspan="3"><a href="../upload/${boardVo.bupload }" download >이미지 다운로드</a></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>

    <a href="./list.jsp"><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href="./modify_view.jsp?bid=${boardVo.bid}"><div class="list">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>