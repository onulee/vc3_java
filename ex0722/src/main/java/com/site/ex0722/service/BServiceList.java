package com.site.ex0722.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0722.dao.BDao;
import com.site.ex0722.vo.BVo;

public class BServiceList implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		//board 전체리스트 가져오기 - ArrayList
		ArrayList<BVo> list = bDao.boardAllSelect();
		request.setAttribute("list", list);

	
	}

}
