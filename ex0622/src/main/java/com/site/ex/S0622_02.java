package com.site.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

                     
@WebServlet("/S02")  
public class S0622_02 extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Servlet2 페이지 접속됨.");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>서블릿 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h2>서블릿에서 페이지를 오픈합니다.</h2>");
		pw.println("<p><a href='movie/movie.jsp'>다음페이지이동</a></p>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}
