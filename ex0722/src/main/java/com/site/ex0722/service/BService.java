package com.site.ex0722.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BService {
	
	//request,response 2개 매개변수로 받음.
	public void execute(HttpServletRequest request,HttpServletResponse response);

}
