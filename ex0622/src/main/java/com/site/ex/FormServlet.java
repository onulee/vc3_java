package com.site.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;


@WebServlet("/FS")
public class FormServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
	}
	
	public void doAction(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		request.setCharacterEncoding("utf-8");
		String stuNo="",name="";
		int kor=0,eng=0,math=0;
		stuNo = request.getParameter("stuNo");
		name = request.getParameter("name");
		kor = Integer.parseInt(request.getParameter("kor"));
		eng = Integer.parseInt(request.getParameter("eng"));
		math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math;
		String avg = String.format("%.2f", (kor+eng+math)/3.0);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<html><head>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>학번 : "+stuNo+"</h3>");
		pw.println("<h3>이름 : "+name+"</h3>");
		pw.println("<h3>국어 : "+kor+"</h3>");
		pw.println("<h3>영어 : "+eng+"</h3>");
		pw.println("<h3>수학 : "+math+"</h3>");
		pw.println("<h3>합계 : "+total+"</h3>");
		pw.println("<h3>평균 : "+avg+"</h3>");
		pw.println("</body></html>");
		pw.close();
		
	}
	
	
	
	
	

}
