<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>수정페이지</title>
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
	  <%!
	    String stuNo,name;
	    int kor,eng,math,total;
	    double avg;
	  %>
	  <%
	    stuNo = request.getParameter("stuNo");
	    name = request.getParameter("name");
	    kor = Integer.parseInt(request.getParameter("kor"));
	    eng = Integer.parseInt(request.getParameter("eng"));
	    math = Integer.parseInt(request.getParameter("math"));
	    total = kor+eng+math;
	    avg = total/3.0;
	  %>
	  <h3>학생성적 수정페이지</h3>
	  <form action="./result.jsp" method="post" id="stuScoreForm" name="stuScoreForm">
        <label>학번</label>
        <input type="text" id="stuNo" name="stuNo" value="<%=stuNo %>" readonly><br> 
        <label>이름</label>
        <input type="text" id="name" name="name" value="<%=name %>"><br> 
        <label>국어</label>
        <input type="text" id="kor" name="kor" value="<%=kor %>"><br> 
        <label>영어</label>
        <input type="text" id="eng" name="eng" value="<%=eng %>"><br> 
        <label>수학</label>
        <input type="text" id="math" name="math" value="<%=math %>"><br> 
        <label>합계</label>
        <input type="text" id="math" name="math" value="<%=total %>" readonly><br> 
        <label>평균</label>
        <input type="text" id="math" name="math" value="<%=avg %>" readonly><br> 
        
        <input type="button" onclick="formCheck()" value="수정" >
      
      </form>
	
	</body>
</html>