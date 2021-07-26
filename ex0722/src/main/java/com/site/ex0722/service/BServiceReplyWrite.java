package com.site.ex0722.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0722.dao.BDao;

public class BServiceReplyWrite implements BService {

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
			String bname = multi.getParameter("bname");
			int bgroup = Integer.parseInt(multi.getParameter("bgroup"));
			int bstep = Integer.parseInt(multi.getParameter("bstep"));
			int bindent = Integer.parseInt(multi.getParameter("bindent"));
			String bupload = multi.getFilesystemName("bupload1");
			
			// replyboard 1개 저장 - int
			int result = bDao.boardReplyInsert(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bupload);
			request.setAttribute("result", result);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
