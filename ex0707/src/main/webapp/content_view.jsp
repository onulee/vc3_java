<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
    function form_submit(){
    	alert("test");
    	document.form.submit();
    	
    }
  
  
  </script>
</head>
<body>
<%
   //db에서 데이터를 가져옴  write-> db저장을 시키고 -> 데이터를 가져옴
   request.setCharacterEncoding("utf-8");
   String bname = request.getParameter("bname");
   String btitle = request.getParameter("btitle");
   String bcontent = request.getParameter("bcontent");
   String bip = request.getRemoteAddr();
   String bid="1";
   String bhit="1";
   
   //날짜1
   Date today = new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
   String bdate = sdf.format(today);
   
   //날짜2
   SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
   String bdate2 = sdf2.format(System.currentTimeMillis());
   
%>
<form action="./modify_view.jsp" name="form">
  <input type="hidden" name="bname" value="<%=bname %>">
  <input type="hidden" name="btitle" value="<%=btitle %>">
  <input type="hidden" name="bcontent" value="<%=bcontent %>">
  <input type="hidden" name="bid" value="<%=bid %>">
  <input type="hidden" name="bhit" value="<%=bhit %>">
  <input type="hidden" name="bip" value="<%=bip %>">
</form>
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
        <td colspan="3"><strong><%=btitle %></strong></td>
      </tr>
      <tr>
        <td><%=bname %></td>
        <td>조회수</td>
        <td><%=bhit %></td>
      </tr>
      <tr>
        <td colspan="3" class="article"><%=bcontent %></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>

    <a href=""><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href="#"><div class="list" onclick="form_submit()">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>