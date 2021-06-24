<%@page import="com.site.ex.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
</head>
<body>
<%--db에서 가져오게 됨. --%>
<%
   ArrayList<Board> list = new ArrayList<Board>();
   list.add(new Board(1,"게시판입니다.1","내용입니다.","홍길동",1));
   list.add(new Board(2,"게시판입니다.2","내용입니다.","이순신",1));
   list.add(new Board(3,"게시판입니다.3","내용입니다.","유관순",1));
   list.add(new Board(4,"게시판입니다.4","내용입니다.","강감찬",1));
   list.add(new Board(5,"게시판입니다.5","내용입니다.","김구",1));
   list.add(new Board(6,"게시판입니다.6","내용입니다.","김유신",1));
   list.add(new Board(7,"게시판입니다.7","내용입니다.","홍길동",1));
   list.add(new Board(8,"게시판입니다.8","내용입니다.","홍길동",1));
   list.add(new Board(9,"게시판입니다.9","내용입니다.","홍길동",1));
   list.add(new Board(10,"게시판입니다.10","내용입니다.","홍길동",1)); 
%>
<section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/search" name="search" method="post">
        <select name="category" id="category">
          <option value="0">전체</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" size="16">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="18%">
        <col width="44%">
        <col width="18%">
        <col width="8%">
        <col width="12%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>조회수</th>
        <th>작성일</th>
      </tr>
      <%
         for(int i=0;i<list.size();i++){
      %>  	 
      <!-- 내용 시작 -->
	      <tr>
	        <td><span class="table-notice"><%=list.get(i).getNum() %></span></td>
	        <td class="table-title">
	        <a href=""><%= list.get(i).getTitle() %></a>
	        </td>
	        <td><%=list.get(i).getName() %></td>
	        <td><%=list.get(i).getHit() %></td>
	        <td><%=list.get(i).getRdate() %></td>
	      </tr>
      <%}%>
      <!-- 내용 끝 -->
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>