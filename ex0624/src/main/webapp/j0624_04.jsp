<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		  function formCheck(){
			  if($("#name").val()==""){
				  alert('이름은 필수입니다. 이름을 입력해주세요.');
				  $("#name").focus();
				  return false;
			  }
			  
			  return $("#stuScoreForm").submit();
		  }
		
		
		
		</script>
	</head>
	<body>
	  <!-- j0624_04.jsp 학번,이름,국어,영어,수학  -->
	  <!-- result.jsp 학번,이름,국어,영어,수학,합계,평균  -->
	  <!-- modify.jsp 학번,이름,국어,영어,수학,합계,평균  -->
      <h3>학생성적 입력페이지</h3>
      <form action="./result.jsp" method="post" id="stuScoreForm" name="stuScoreForm">
        <label>학번</label>
        <input type="text" id="stuNo" name="stuNo"><br> 
        <label>이름</label>
        <input type="text" id="name" name="name"><br> 
        <label>국어</label>
        <input type="text" id="kor" name="kor"><br> 
        <label>영어</label>
        <input type="text" id="eng" name="eng"><br> 
        <label>수학</label>
        <input type="text" id="math" name="math"><br> 
        <input type="button" onclick="formCheck()" value="저장" >
        <input type="reset" value="취소"><br>
      
      </form>

	
	</body>
</html>