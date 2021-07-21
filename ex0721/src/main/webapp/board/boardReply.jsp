<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
	  <ul>
	    <li><a href="./login.do">로그인</a></li>
	    <li><a href="./member.do">회원가입</a></li>
	    <li><a href="./logout.do">로그아웃</a></li>
	    <li><a href="./list.do">게시판</a></li>
	    <li><a href="./member_modify.do">회원정보수정</a></li>
	  </ul>
	
	</body>
</html>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>글수정</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
</head>
<body>
<section>
    <h1>게시글수정</h1>
    <hr>

    <form action="reply.do" name="reply" method="post">
      <table>
      <input type="hidden" name="bId" value="test">
      <input type="hidden" name="bGroup" value="test">
      <input type="hidden" name="bStep" value="test">
      <input type="hidden" name="bIndent" value="test">
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" name="bName">
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="bTitle" value="<답변> test">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
<textarea name="bContent" cols="50" rows="10">

---------------------------
[답글]
test
</textarea>
          </td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
            <input type="file" name="file" id="file">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <button type="submit" class="write">답변완료</button>
        <button type="button" class="cancel" onclick="javascript:location.href='list.do'">취소</button>
      </div>
    </form>

  </section>

</body>
</html>