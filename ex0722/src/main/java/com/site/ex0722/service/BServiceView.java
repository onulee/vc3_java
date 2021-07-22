package com.site.ex0722.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0722.dao.BDao;
import com.site.ex0722.vo.BVo;

public class BServiceView implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		
		int bid = Integer.parseInt(request.getParameter("bid"));
		//board 1개 리스트 가져오기 - BVo
		BVo bVo = bDao.boardOneSelect(bid);
		request.setAttribute("bVo", bVo);

	}

}
