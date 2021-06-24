package com.site.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Ex02"},initParams = {@WebInitParam(name="id",value="admin"),@WebInitParam(name="pw",value="1111")})
public class Ex0623_02 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		String masterId = getServletContext().getInitParameter("masterId");
		String masterPw = getServletContext().getInitParameter("masterPw");
		System.out.println(masterId);
		System.out.println(masterPw);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
