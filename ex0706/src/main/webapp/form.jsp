<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			#tb3{
				border-bottom:1px solid black;
				border-top: 1px solid black;
				border-collapse: collapse;
			}
			table{
				margin-left: 500px
			}
			
		</style>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function check(){
				alert("test");
				if($("#id").val().length<3){
					alert("아이디를 3자이상 입력해주세요");
					$("#id").focus();
					return false;
				}
				if($("#pw1").val() != $("#pw2").val()){
					alert("비밀번호가 다릅니다. 다시입력해주세요");
					$("#pw1").val("");
					$("#pw2").val("");
					$("#pw1").focus();
					return false;
				}
				return $("#form").submit()
			}
			
			
		</script>
	</head>
	<body>
		<form action="./formOk.jsp" method = "post" name = "form" id = "form">
			<table border = "1" style="border: 1px solid black; border-collapse: collapse;" >
				<tr>
					<td>아이디</td><td colspan="2"><input type = "text" name = "id" id ="id"></td>
				</tr>
				
				<tr>
					<td>비밀번호</td><td colspan="2"><input type = "password" name = "pw1" id ="pw1"></td>
				</tr>
				
				<tr>
					<td>비밀번호 확인</td><td colspan="2"><input type = "password" name = "pw2" id ="pw2"></td>
				</tr>
				
				<tr>
					<td>소식자 수신여부</td><td colspan="2"><input type = "radio" name = "acc" id ="acception" value = "acception">
					<label for ="acception">수신</label><input type = "radio" name = "acc" id ="non_acception" value = "non_acception">
					<label for ="non_acception">미수신</label></td>
				</tr>
				
			</table><br>
			<table border = "1" style="border: 1px solid black; border-collapse: collapse;" >
				<tr>
					<td>
						관심연령
					</td>
					<td colspan="3">
						<select name = "inter_age">
							<option value = "10대">10대</option>
							<option value = "20대">20대</option>
							<option value = "30대">30대</option>
						</select>
					</td>
					<td>
						성별
					</td>
					<td>
						<input type = "radio" name = "gender" value = "male" id = "male">
						<label for = "male">남자</label>
						<input type = "radio" name = "gender" value = "female" id = "female">
						<label for = "female">여자</label>
					</td>
				</tr>
				<tr>
				<td>결혼여부</td>
				<td colspan = "3">
					<input type = "radio" name = "marrige" value = "married" id = "married">
					<label for = "married"> 기혼</label>
					<input type = "radio" name = "marrige" value = "non_married" id = "non_married">
					<label for = "non_married"> 미혼</label>
				</td>
				<td>
					자녀유무
				</td>
				<td>
					<input type = "radio" name = "child" value = "hav_child" id = "hav_child">
					<label for = "hav_child">있음</label>
					<input type = "radio" name = "child" value = "non_child" id = "non_child">
					<label for = "non_child">없음</label>
				</td>
				</tr>
				<tr>
					<td>
						직업
					</td>
					<td colspan = "6">
						<select name = "job">
							<option value = "student">학생</option>
							<option value = "employee">회사원</option>
							<option value = "soldier">군인</option>
						</select>
					</td>
				</tr>
			</table>
			<br>
					<table id = "tb3">
						<tr>
							<td>
						<input type = "checkbox" name = "int_topic" value = "laws">
						<label for = "laws">가정법률</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "childlaws">
						<label for = "childlaws">아동청소년/법률</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "l_house">
						<label for = "l_house">부동산/임대차</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "bank">
						<label for = "bank">금융/금전</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "business">
						<label for = "business">사업</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "founded">
						<label for = "founded">창업</label>
							</td>
						</tr>
						<tr>
							<td>
						<input type = "checkbox" name = "int_topic" value = "trade">
						<label for = "trade">무역/출입국</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "customer">
						<label for = "customer">소비자</label>
							</td>
							<td>
						<input type = "checkbox" name = "" value = "culture">
						<label for = "culture">문화/여가생활</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "lawsuit">
						<label for = "lawsuit">민형사/소송</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "traffic">
						<label for = "traffic">교통/운전</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "work">
						<label for = "work">근로/노동</label>
							</td>
						</tr>
						<tr>
							<td>
						<input type = "checkbox" name = "int_topic" value = "welfare">
						<label for = "welfare">복지</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "military">
						<label for = "military">국방/보훈</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "tech">
						<label for = "tech">정보통신/기술</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "enviroment">
						<label for = "enviroment">환경/에너지</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "criminal">
						<label for = "criminal">사회안전/범죄</label>
							</td>
							<td>
						<input type = "checkbox" name = "int_topic" value = "country">
						<label for = "country">국가 및 지자체</label>
							</td>
						</tr>
					</table>
				<table style="margin-left: 500px; margin-right: auto; ">
					<tr>
						<td align="center">
						<input type = "button" value = "저장" onclick = "check()" >
						</td>
					</tr>
				</table>
		</form>
	</body>
</html>