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
		<title>Insert title here</title>
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
		     String sql="select employee_id,emp_name,e.department_id,department_name from employees e,departments d where e.department_id = d.department_id";
		     rs = stmt.executeQuery(sql);
		     %>
		     <table>
			     <tr>
			      <td>사원번호</td>
			      <td>사원이름</td>
			      <td>부서번호</td>
			      <td>부서이름</td>
			     </tr>
		     <%
		     while(rs.next()){
		    	 int employee_id = rs.getInt("employee_id");
		    	 String emp_name = rs.getString("emp_name");
		    	 int department_id = rs.getInt("department_id");
		    	 String department_name = rs.getString("department_name");
		     %>
			     <tr>
			      <td><%=employee_id %></td>
			      <td><%=emp_name %></td>
			      <td><%=department_id %></td>
			      <td><%=department_name %></td>
			     </tr>
		     
		     
		     
		     
		     <% //out.println(employee_id+","+emp_name+","+department_id+","+department_name+"<br>");
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