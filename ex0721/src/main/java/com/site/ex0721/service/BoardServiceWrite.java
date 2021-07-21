package com.site.ex0721.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0721.Vo.BVo;
import com.site.ex0721.dao.BDao;

public class BoardServiceWrite implements BoardService {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		// boardWrite.jsp에서 파라미터값으로 데이터 전달 받음
		String cpath="c:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request,cpath,size,"utf-8",new DefaultFileRenamePolicy());
			String bname = multi.getParameter("bname");
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bupload = multi.getFilesystemName("file1");
			
			//게시판 1개 저장
			int result = bDao.boardWrite(bname,btitle,bcontent,bupload);
			request.setAttribute("result", result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
