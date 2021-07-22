<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
	  table,th,td{border:1px solid black; border-collapse: collapse;}
	</style>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script language="javascript">
		var count = 1;
		var addCount;
	
		//행추가
		function addInputBox() {
			alert($('input:checkbox[name="checkList"]').length);
			if($('input:checkbox[name="checkList"]').length<=0){
				addCount=1;
			}else{
				addCount++;
			}
			var addStr = "<tr><td><input type='checkbox' name='checkList' value="+addCount+"></td><td><input type='file' name='file"+addCount+"'></td></tr>";
			$("#dynamic_table").append(addStr);
		}
	
		//행삭제
		function subtractInputBox() {
			
		}
	
		function submitbutton() {
			var gform = document.gForm;
			gform.count.value = eval(count);
			//alert(count);
			gForm.submit();
			return;
		}
	</script>
	</head>
	<BODY -nLoad="addInputBox()">
		<input type="button" value="행 추가" onclick="addInputBox();">:
		<input type="button" value="행 삭제"
			onclick="subtractInputBox();">
		<br>
		<br>
		<input type="button" value="전송" onclick="submitbutton();">
		<form name="gForm" action="upload.do" enctype="multipart/form-data" method="post">
			<input type="hidden" name="count">
	
			<table id="">
				<tr>
					<td>체크</td>
					<td>내용</td>
				</tr>
				<tbody id="dynamic_table">
				
				</tbody>
			</table>
		</form>
	</BODY>
</HTML>
