package com.site.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/initS")
public class initS extends HttpServlet {
	
	@PostConstruct
	public void postCont() {
		System.out.println("선처리 : Init()메소드보다 먼저 실행됩니다.");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init() : 객체생성시 단 1번 작동이 됩니다.");
		System.out.println("두번째 호출부터는 실행되지 않습니다.");
	}
	
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
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() : 서버종료시 단 1번 호출이 됩니다.");
	}
	
	@PreDestroy
	private void preDes() {
		System.out.println("PreDestroy() : 서버종료시 destory()메소드보다 나중에 실행됩니다.");

	}
	
	
	
}
