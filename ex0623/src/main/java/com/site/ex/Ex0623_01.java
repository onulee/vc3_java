package com.site.ex;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Ex0622")
public class Ex0623_01 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//File file1 = new File(getInitParameter("path"));
		
		
		request.setCharacterEncoding("utf-8");
		System.out.println("doAction");
		
		String masterId = getServletContext().getInitParameter("masterId");
		String masterPw = getServletContext().getInitParameter("masterPw");
		
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String name = getInitParameter("name");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head>");
		writer.println("<title>test</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h3>masterId : "+ masterId +"</h3>");
		writer.println("<h3>masterPw : "+ masterPw +"</h3>");
		writer.println("<h3>id : "+ id +"</h3>");
		writer.println("<h3>pw : "+ pw +"</h3>");
		writer.println("<h3>name : "+ name +"</h3>");
		writer.println("</body></html>");
		writer.close();
		
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
