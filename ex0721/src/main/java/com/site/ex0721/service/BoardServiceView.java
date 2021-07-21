package com.site.ex0721.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721.Vo.BVo;
import com.site.ex0721.dao.BDao;

public class BoardServiceView implements BoardService {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		// boardList.jsp에서 파라미터값으로 bid전달 받음
		int bid = Integer.parseInt(request.getParameter("bid"));
		//게시판 1개 가져오기
		BVo bVo = bDao.boardOneList(bid);
		request.setAttribute("bVo", bVo);

	}

}
