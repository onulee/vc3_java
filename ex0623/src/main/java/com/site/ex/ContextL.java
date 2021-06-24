package com.site.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextL implements ServletContextListener {

	@Override //웹어플리케이션 최초 실행시
	public void contextInitialized(ServletContextEvent sce) {
	   System.out.println("웹어플리케이션 최초 실행시 1번 실행됩니다.");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	   System.out.println("웹어플리케이션 종료시 1번 실행됩니다.");
	}
	
	
	
}
