package com.site.ex0722.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.ex0722.service.BService;
import com.site.ex0722.service.BServiceDelete;
import com.site.ex0722.service.BServiceList;
import com.site.ex0722.service.BServiceReplyWrite;
import com.site.ex0722.service.BServiceUpdate;
import com.site.ex0722.service.BServiceView;
import com.site.ex0722.service.BServiceWrite;


@WebServlet("*.do")
public class BController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String cpath = request.getContextPath();
		String filepath = uri.substring(cpath.length());
		BService bService=null;
		//forward명령어 - 
		RequestDispatcher dispatcher=null;
		//response.sendRedirect("./blist.jsp");-request,response 빈정보를 보냄.
		HttpSession session = request.getSession();
		
		
		if(filepath.equals("/board/blist.do")) {
			bService = new BServiceList();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("./blist.jsp");
		}else if(filepath.equals("/board/bview.do")){
			bService = new BServiceView();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("./bview.jsp");
		}else if(filepath.equals("/board/bwrite.do")){
			dispatcher = request.getRequestDispatcher("./bwrite.jsp");
		}else if(filepath.equals("/board/bwriteOk.do")){
			bService = new BServiceWrite();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("blist.do");
		}else if(filepath.equals("/board/bdelete.do")){
			bService = new BServiceDelete();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("bdelete.jsp");
		}else if(filepath.equals("/board/bmodify.do")){
			bService = new BServiceView(); //view,modify같이 사용
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("bmodify.jsp");
		}else if(filepath.equals("/board/bmodifyOk.do")){
			bService = new BServiceUpdate(); //수정update
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("blist.do");
		}else if(filepath.equals("/board/breply.do")){
			bService = new BServiceView(); //view,modify,reply같이 사용
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("breply.jsp");
		}else if(filepath.equals("/board/breplyOk.do")){
			bService = new BServiceReplyWrite(); //답변달기 insert
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("reset.jsp");
		}
		else {
			// *.do 잘못된 주소 입력은 모두 root페이지로 이동
			dispatcher = request.getRequestDispatcher("/"); 
		}
		
		dispatcher.forward(request, response);
		
		
		
	}
	
	//-----------------------------------------------------
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
