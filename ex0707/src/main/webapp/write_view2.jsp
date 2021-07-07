<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 쓰기</title>
	</head>
	<body>
	<h3>게시판 쓰기</h3>
	  <form action="./content_view2.jsp">
	    <label>번호</label>
	    <input type="text" id="bid" name="bid"><br>
	    <label>제목</label>
	    <input type="text" id="btitle" name="btitle"><br>
	    <label>내용</label>
	    <input type="text" id="bcontent" name="bcontent"><br>
	    <label>작성자</label>
	    <input type="text" id="bname" name="bname"><br>
	    <label>작성일</label>
	    <input type="date" id="bdate" name="bdate"><br>
	    <label>조회수</label>
	    <input type="text" id="bhit" name="bhit"><br>
	    <label>ip</label>
	    <input type="text" id="bip" name="bip" value="<%=request.getRemoteAddr() %>" readonly><br>
	    <label>공지글등록</label>
	    <input type="radio" id="n_yes" name="notice" value="n_yes">공지글등록
	    <input type="radio" id="n_no" name="notice" value="n_no">공지글취소<br>
	    <label>글카테고리</label>
	    <input type="checkbox" id="screen" name="category" value="screen">영화<br>
	    <input type="checkbox" id="trianing" name="category" value="trianing">운동<br>
	    <input type="checkbox" id="music" name="category" value="music">음악<br>
	    <input type="checkbox" id="etc" name="category" value="etc">기타<br>
	    <input type="submit" value="저장">
	    <input type="reset" value="취소">
	  
	  </form>
	
	</body>
</html>