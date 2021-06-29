<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		   function formCheck(){
			   alert("테스트");
			   if( $("#id").val().length<3){
				   alert("3자리 이상 입력하셔야 합니다.");
				   $("#id").focus();
				   return false; 
			   }
			   
			   return document.form.submit();
		   }
		</script>
        <%
           if(request.getParameter("login_flag") !=null){
        %>
           <script type="text/javascript">
             alert("아이디와 패스워드가 일치하지 않습니다. 다시 입력하세요.!");
           </script>
        
        <% 
           }
        %>		
	</head>
	<body>
	  <form action="./loginCheck.jsp" method="post" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id"><br>
	    <label>패스워드</label>
	    <input type="text" id="pw" name="pw"><br>
	    <input type="button" onclick="formCheck()" value="로그인">
	  
	  </form>
	
	</body>
</html>