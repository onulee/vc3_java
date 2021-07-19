<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파일 확인</title>
	</head>
	<body>
		<%
		  // tomcat의 upload위치를 말함.
		  //String path = request.getRealPath("upload");
		  String path = "c:/aaa";
		  int size = 10 * 1024 * 1024;  // 10*1024kb*1024b
		try{
		  MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());
		  String btitle = multi.getParameter("btitle");
		  String bname = multi.getParameter("bname");
		  String fileName = multi.getFilesystemName("file1");
		  String fileName2 = multi.getFilesystemName("file2");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		%>  
		<h3>파일업로드 정보</h3>
		<table>
		 <tr>
		   <th>글제목</th>
		   <td><%=btitle %></td>
		 </tr>
		 <tr>
		   <th>작성자</th>
		   <td><%=bname %></td>
		 </tr>
		 <tr>
		   <th>파일명</th>
		   <td><%=fileName %></td>
		 </tr>
		 <tr>
		   <th>이미지</th>
		   <td><img src="./upload/<%=fileName %>"></td>
		 </tr>
		 <tr>
		   <th>파일명</th>
		   <td><%=fileName2 %></td>
		 </tr>
		 <tr>
		   <th>이미지</th>
		   <td><img src="./upload/<%=fileName2 %>"></td>
		 </tr>
		 
		
		
		</table>
	
	
	
	
	
	</body>
</html>