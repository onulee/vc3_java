<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		  //jQuery선언 - html 
		  $(function(){
			  var msg2 = <%=request.getParameter("msg")%>;
			  if(msg2 !=null){
					 alert(msg2);
			  } 
			  
			  var msg1 = "<%=request.getParameter("msg")%>";
			  //msg변수에 데이터가 있으면
			  if(msg1 !="null"){
				 alert(msg1);
			  } 
		  });
		
		  function formCheck(){
			   if($("#id").val()==""){
				   alert("ID를 입력해주세요.");
				   $("#id").focus();
				   return false;
			   }
			   document.login_form.submit();
		   }
		</script>
	</head>
	<body>
	  
	 
	
	
	  <h3>로그인</h3>
	  <form action="./LoginOk" method="post" name="login_form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id"><br>
	    <label>패스워드</label>
	    <input type="password" id="pw" name="pw"><br>
	    <input type="button" onclick="formCheck()" value="로그인">
	    <a href="./index.jsp">
	      <input type="button" value="취소">
	    </a><br>
	  </form>
	
	</body>
</html>