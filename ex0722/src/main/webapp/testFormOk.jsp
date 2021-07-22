<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>formOk</title>
		<style type="text/css">
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	<%
	  String savePath = "c:/upload";
	  int size = 10*1024*1024;
	  String name="";
	  String title="";
	  int fileCount=0;
	 
		  MultipartRequest multi = new MultipartRequest(request,savePath,size,"utf-8",new DefaultFileRenamePolicy());
			
		  name = multi.getParameter("name");
		  title = multi.getParameter("title");
		  fileCount = Integer.parseInt(multi.getParameter("fileCount"));
		  //파일첨부 개수
		   String[] uploads = new String[fileCount];
		  
		  Enumeration e = multi.getFileNames();
		  int i=0;
		  while(e.hasMoreElements()){ //읽어올 데이터가 있는지 확인
			  String fname = (String)e.nextElement(); //1개 데이터를 읽어옴.
		      uploads[i]=multi.getFilesystemName(fname);
			  i++;
		  }  
	  
	  
	%>
	<h3>파일정보</h3>
	<table>
	  <tr>
	    <td>작성자</td>
	    <td><%= name %></td>
	  </tr>
	  <tr>
	    <td>제목</td>
	    <td><%= title %></td>
	  </tr>
	  <!-- 파일첨부시작 -->
	  <% for(int j=0;j<fileCount;j++){ %>
		  <tr>
		    <td>파일첨부</td>
		    <td><%=uploads[j] %></td>
		  </tr>
	  <%}%>
	  <!-- 파일첨부 끝 -->
	
	</table>
	
	
	
	
	</body>
</html>