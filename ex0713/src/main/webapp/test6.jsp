<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>board</title>
	<style type="text/css">
		  table,th,td{border:1px solid black;}
	</style>
	</head>
	<body>
	  <%
	     Connection conn=null;
	     Statement stmt = null;
	     ResultSet rs = null;
	     try{
	    	 Class.forName("oracle.jdbc.driver.OracleDriver"); 
	    	 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
		     stmt = conn.createStatement();
		     String sql="select * from board";
		     rs = stmt.executeQuery(sql);
		 %>
		   <table>
		     <tr>
		       <th>번호</th>
		       <th>제목</th>
		       <th>작성자</th>
		       <th>작성일</th>
		       <th>조회수</th>
		     </tr>
		 <%
		     while(rs.next()){
		    	 int bid = rs.getInt("bid");
		    	 String btitle = rs.getString("btitle");
		    	 String bname = rs.getString("bname");
		    	 Timestamp bdate = rs.getTimestamp("bdate");
		    	 int bhit = rs.getInt("bhit");
		 %>
		     <tr>
		       <td><%=bid %></td>
		       <td><%=btitle %></td>
		       <td><%=bname %></td>
		       <td><%=bdate %></td>
		       <td><%=bhit %></td>
		     </tr>
		 <%   	 
		    	 
		     }
	     %>
	       </table>
	     <%	 
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }finally{
	    	 try{
	    		 if(rs!=null) rs.close();
		   		 if(stmt!=null) stmt.close();
		   		 if(conn!=null) conn.close();
	    	 }catch(Exception e2){
	    		 e2.printStackTrace();
	    	 }
	     }
	     
	  
	  
	   
	  
	  
	  
	  %>
	
	</body>
</html>