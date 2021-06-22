package com.site.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MC")
public class MemControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");  //post한글처리
		
		String id="",pw="",name="",tel="",tel2="",gender="",hobbys="";
		String[] hobby;
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		tel = request.getParameter("tel");
		tel2 = request.getParameter("tel2");
		gender = request.getParameter("gender");
		hobby = request.getParameterValues("hobby");
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys = hobbys + hobby[i];
			else hobbys = hobbys+","+hobby[i];
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head>");
		writer.println("<title></title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h3>아이디 : "+id+"</h3>");
		writer.println("<h3>패스워드 : "+pw+"</h3>");
		writer.println("<h3>이름 : "+name+"</h3>");
		writer.println("<h3>전화번호 : "+tel+tel2+"</h3>");
		writer.println("<h3>성별 : "+gender+"</h3>");
		writer.println("<h3>취미 : "+hobbys+"</h3>");
		writer.println("</body></html>");
		writer.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
