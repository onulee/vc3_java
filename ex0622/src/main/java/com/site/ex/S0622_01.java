package com.site.ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S01")
public class S0622_01 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet 페이지 접속됨.");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>서블릿 페이지</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h2>서블릿에서 페이지를 오픈합니다.</h2>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		
		//FileWriter fw = new FileWriter(file1,true);
		// fw.write("글자를 입력합니다.");
		// fw.flush();
		// fw.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}
