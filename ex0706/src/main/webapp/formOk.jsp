<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = "", pw = "", acc = "", inter_age = "", gender = "",
			marrige = "", job = "", int_topics = "", child = "";
			String[] int_topic = null;
			id = request.getParameter("id");
			pw = request.getParameter("pw2");
			acc = request.getParameter("acc");
			inter_age = request.getParameter("inter_age");
			gender = request.getParameter("gender");
			marrige = request.getParameter("marrige");
			job = request.getParameter("job");
			child = request.getParameter("child");
			int_topic = request.getParameterValues("int_topic");
			for(int i=0; i<int_topic.length;i++){
				if( i == 0){
					int_topics += int_topic[i];
				}else{
					int_topics += "," + int_topic[i];
				}
			}
		%>
		<table border = '1' style=' border: 1px solid black; border-collapse: collapse'>
			<tr>
				<td>
					아이디
				</td>
				<td>
					<%=id %>
				</td>
			</tr>
			<tr>
				<td>
					비밀번호
				</td>
				<td>
					<%=pw %>
				</td>
			</tr>
			<tr>
				<td>
					수신여부
				</td>
				<td>
					<%=acc %>
				</td>
			</tr>
			<tr>
				<td>
					관심연령
				</td>
				<td>
					<%=inter_age %>
				</td>
			</tr>
			<tr>
				<td>
					성별
				</td>
				<td>
					<%=gender %>
				</td>
			</tr>
			<tr>
				<td>
					결혼여부
				</td>
				<td>
					<%=marrige %>
				</td>
			</tr>
			<tr>
				<td>
					자녀유무
				</td>
				<td>
					<%=child %>
				</td>
			</tr>
			<tr>
				<td>
					직업
				</td>
				<td>
					<%=job %>
				</td>
			</tr>
			<tr>
				<td>
					관심활동
				</td>
				<td>
					<%=int_topics %>
				</td>
			</tr>
		</table>
		
		<form action="./form_update.jsp">
		  <input type="hidden" name="id" value=<%=id %>>
		  <input type="hidden" name="pw" value=<%=pw %>>
		  <input type="hidden" name="inter_age" value=<%=inter_age %>>
		  <input type="hidden" name="gender" value=<%=gender %>>
		  <input type="hidden" name="marrige" value=<%=marrige %>>
		  <input type="submit" value="수정">
		
		</form>
	</body>
</html>












