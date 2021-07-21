package com.site.ex0721;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("*.do")
public class BoardController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher=null;
		String uri = request.getRequestURI();
		String cpath = request.getContextPath();
		String fname = uri.substring(cpath.length());
		
		if(fname.equals("/login.do")) {
			System.out.println("호출페이지 : "+fname);
			System.out.println("login.jsp페이지 호출함");
		}else if(fname.equals("/member.do")) {
			System.out.println("호출페이지 : "+fname);
			System.out.println("member.jsp페이지 호출함");
		}else if(fname.equals("/logout.do")) {
			System.out.println("호출페이지 : "+fname);
			System.out.println("logout.jsp페이지 호출함");
			
		}else if(fname.equals("/list.do")) {
			System.out.println("호출페이지 : "+fname);
			BService service = new BServiceList();
			service.excute(request, response); //request정보가 여기에 남아 있음. list
			//현재 request정보를 forward하는 객체
			// response.sendRedirect도 forward하는 객체인데 현재request정보를 전달하지 않음.
			dispatcher = request.getRequestDispatcher("./list.jsp");
			
		}else if(fname.equals("/member_modify.do")) {
			System.out.println("호출페이지 : "+fname);
			
			
			System.out.println("db접근해서 1명의 회원정보데이터 가져오기");
			System.out.println("member_modify.jsp페이지로 데이터 전달해서 호출함");
		}
		
		//주소 forward시키는 명령어 - 기존 request,response정보를 같이 보내줌.
		dispatcher.forward(request, response);
		
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter writer = response.getWriter();
//		writer.println("<html><head></head><body>");
//		writer.println("<h3>확장자패턴 작업</h3>");
//		writer.println("<h3>uri : "+uri+"</h3>");
//		writer.println("<h3>cpath : "+cpath+"</h3>");
//		writer.println("<h3>파일이름 fname : "+fname+"</h3>");
//		writer.println("</body></html>");
//		writer.close();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

}
