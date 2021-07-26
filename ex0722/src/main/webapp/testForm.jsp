<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>testForm</title>
		<style type="text/css">
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	    <script type="text/javascript">
	        var count=1;
	       
	        //행삭제
	        function subInput(){
	        	//체크박스 개수
	        	if($("input:checkbox[name=filecheck]").length<=0){
	        		alert("파일첨부가 1개 이상 있어야 삭제가 가능합니다.");
	        		return false;
	        	}
	        	
	        	//체크박스에 체크되어 있는 개수
	        	if($("input:checkbox[name=filecheck]:checked").length<=0){
	        		alert("체크가 1개 이상 되어야 삭제가 가능합니다.");
	        		return false;
	        	}
	        	
	        	//체크박스 모두 검색후 체크되어 있는 것 삭제
	        	$("input:checkbox[name=filecheck]").each(function(){
	            	if(this.checked){
	            		$("#"+this.value).remove();
	            	}
	            });
	        }
	        
	        //행추가
	        function addInput(){
	        	alert("파일업로드 행추가 : "+count);
	        	var addHtml="";
	        	addHtml = addHtml +'<tr id="'+count+'">';
	        	addHtml = addHtml +'<td><input type="checkbox" id="ch'+count+'" name="filecheck" value="'+count+'" ></td>';
	        	addHtml = addHtml +'<td><input type="file" id="file'+count+'" name="file'+count+'"></td>';
	        	addHtml = addHtml +'</tr>';
	        	count++;
	        	$("#tbodyTr").append(addHtml);
	        	
	        	//$("#tbodyTr").prepend(addHtml);
	        	//$("#tbodyTr").html(addHtml);
	        	//$("#name").val("");
	        	//$("#title").val("");
	        	//$("#name").focus();
	        }
	        
	        //submit
	        function submitForm(){
	        	// input중 checkbox의 이름이 filecheck라고 되어 있는 것
	        	$("#fileCount").val($("input:checkbox[name=filecheck]").length);
	        	$("#testForm").submit();
	        }
	        
 		 </script>
	</head>
	<body>
	  <h3>다중파일업로드</h3>
	  <form action="testFormOk.jsp" id="testForm" method="post" name="testForm" enctype="multipart/form-data">
	    <button type="button" onclick="addInput()">파일업로드 행추가</button>
	    <button type="button" onclick="subInput()">파일업로드 행삭제</button><br>
	    <br><br>
	    
	    <input type="hidden" id="fileCount" name="fileCount">
	    <label>작성자</label>
	    <input type="text" id="name" name="name"><br> 
	    <label>제목</label>
	    <input type="text" id="title" name="title"><br>
	    <input type="button" onclick="submitForm()" value="파일전송"><br>
	    <br><br>
	    
	    <table>
	      <tr>
	        <th>체크</th>
	        <th>파일첨부</th>
	      </tr>
	      <tbody id="tbodyTr">
	        <!-- html소스 들어감 -->
	      </tbody>
	    
	    </table>
	  </form>
	  <table>
	    <tr>
	      
	    </tr>
	  
	  </table>
	
	</body>
</html>