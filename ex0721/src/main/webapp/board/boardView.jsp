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
        <td colspan="3"><strong>${bVo.btitle}</strong></td>
      </tr>
      <tr>
        <td>${bVo.bname }</td>
        <td>조회수</td>
        <td>${bVo.bhit }</td>
      </tr>
      <tr>
        <td colspan="3" class="article">${bVo.bcontent }</td>
      </tr>
      <tr>
        <td colspan="3" class="article">
            <img src="../upload/${bVo.bupload }" />
        </td>
      </tr>
      <tr>
        <td colspan="3" class="article">
         <a href="../upload/${bVo.bupload}" download>이미지다운로드</a>
        </td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>

    <a href="./boardList.do"><div class="list">목록</div></a>
    <a href="./boardDelete.do?bid=${bVo.bid}"><div class="list">삭제</div></a>
    <a href="./boardModify.do?bid=${bVo.bid}"><div class="list">수정</div></a>
    <a href="./boardReply.do?bid=${bVo.bid }"><div class="list">답변달기</div></a>
  </section>
</body>
</html>