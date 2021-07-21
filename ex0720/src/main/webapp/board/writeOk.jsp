<%@page import="com.site.ex0720.BoardDao"%>
<%@page import="com.site.ex0720.BoardVo"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글저장</title>
	</head>
	<body>
	<%
	  BoardDao boardDao = new BoardDao();
	  BoardVo boardVo = null;
	  //String path = request.getRealPath("upload");
	  String path = "c:/upload";
	  int size = 10*1024*1024; //10M
	  int result=0;
	  try{
		  MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());
		  String bname = multi.getParameter("bname");
		  String btitle = multi.getParameter("btitle");
		  String bcontent = multi.getParameter("bcontent");
		  String fileName = multi.getFilesystemName("file");
		  boardVo = new BoardVo(btitle,bcontent,bname,fileName);
		  result = boardDao.boardInsert(boardVo);
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	%>
	<c:set var="result" value="<%=result %>" />

	<script type="text/javascript">
	  if(${result==1}){
		  alert("저장이 완료되었습니다.");
		  location.href="./list.jsp";
	  }else{
		  alert("저장하는 동안 문제가 생겼습니다. 다시 입력을 해주세요.");
		  location.href="./write_view.jsp";
	  }
	
	</script>
	
	</body>
</html>