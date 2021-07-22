package com.site.ex0722.service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0722.dao.BDao;
import com.site.ex0722.vo.BVo;

public class BServiceWrite implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		String cpath = "c:/upload";
		int size = 5 * 1024 * 1024;
		MultipartRequest multi;
		try {
			multi = new MultipartRequest(request, cpath, size, "utf-8", new DefaultFileRenamePolicy());
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bname = multi.getParameter("bname");
			String bupload = multi.getFilesystemName("bupload1");
			
			// board 1개 저장 - int
			int result = bDao.boardInsert(btitle,bcontent,bname,bupload);
			request.setAttribute("result", result);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		// 파일 여러개 업로드 할때
//		String[] uploads = new String[3];
//		Enumeration e = multi.getParameterNames();//bupload1,bupload2,bupload3
//		int i=0;
//		while(e.hasMoreElements()) {
//		  String name =(String)e.nextElement();
//		  uploads[i] = multi.getFilesystemName(name); 
//		  i++;	
//		}

	}

}
