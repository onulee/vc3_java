<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>삭제</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	    <script type="text/javascript">
	        alert("bid : "+${bid});
		    if(${result}==1){
		    	alert("게시물이 삭제되었습니다.");
		    	location.href="blist.do";
		    }else{
		    	alert("시스템 에러로 게시물이 삭제되지 않았습니다.");
		    	location.href="bview.do?bid=${bid}";
		    }
 		 </script>
		
	</head>
	<body>
	
	</body>
</html>