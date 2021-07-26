package com.site.ex0722.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0722.dao.BDao;

public class BServiceUpdate implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		String cpath = "c:/upload";
		int size = 5 * 1024 * 1024;
		MultipartRequest multi;
		try {
			multi = new MultipartRequest(request, cpath, size, "utf-8", new DefaultFileRenamePolicy());
			int bid = Integer.parseInt(multi.getParameter("bid"));
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bupload = multi.getFilesystemName("bupload1");
			String oldbupload = multi.getParameter("oldbupload");
			System.out.println("oldupload : "+oldbupload);
			System.out.println("신규파일이름 : " + multi.getFilesystemName("bupload1"));
			if(multi.getFilesystemName("bupload1")==null) {
				bupload = oldbupload;
			}
			
			// board 1개 수정저장 - int
			int result = bDao.boardUpdate(bid,btitle,bcontent,bupload);
			request.setAttribute("result", result);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
