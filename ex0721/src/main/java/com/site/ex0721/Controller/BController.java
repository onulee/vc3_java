package com.site.ex0721.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721.service.BoardService;
import com.site.ex0721.service.BoardServiceList;
import com.site.ex0721.service.BoardServiceView;
import com.site.ex0721.service.BoardServiceWrite;


@WebServlet("*.do")
public class BController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
	  RequestDispatcher dispatcher=null;
	  
	  String uri = request.getRequestURI();
	  System.out.println(request.getContextPath());
	  String filePath = uri.substring(request.getContextPath().length());
	  
	  if(filePath.equals("/board/boardList.do")) {
		  BoardService boardService = new BoardServiceList();
		  boardService.excute(request, response);
		  dispatcher = request.getRequestDispatcher("./boardList.jsp"); 
	  }else if(filePath.equals("/board/boardView.do")) {
		  BoardService boardService = new BoardServiceView();
		  boardService.excute(request, response);
		  dispatcher = request.getRequestDispatcher("./boardView.jsp");  
	  }else if(filePath.equals("/board/boardWrite.do")) {
		  dispatcher = request.getRequestDispatcher("./boardWrite.jsp");  
	  }else if(filePath.equals("/board/boardWriteOk.do")) {
		  BoardService boardService = new BoardServiceWrite();
		  boardService.excute(request, response);
		  dispatcher = request.getRequestDispatcher("boardList.do");  
	  }
		
	  dispatcher.forward(request, response);
	
	}//doAction
	
	
	//------------------------------------------------------------
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
