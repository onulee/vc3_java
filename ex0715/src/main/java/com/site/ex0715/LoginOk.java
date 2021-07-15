package com.site.ex0715;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginOk")
public class LoginOk extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
			String sql="select * from member2 where id=? and pw=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			//select -> executeQuery, insert,update,delete -> executeUpdate
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("id,pw가 일치합니다.");
				HttpSession session = request.getSession();
				session.setAttribute("session_id", id);
				session.setAttribute("session_nickName", rs.getString("nickName"));
				session.setAttribute("session_flag", "success");
				response.sendRedirect("./index.jsp");
				
			}else {
				System.out.println("id,pw가 일치하지 않습니다.");
				response.sendRedirect("./login.jsp?msgNum=0");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
