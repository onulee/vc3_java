package com.site.ex0721;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServiceList implements BService {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		//dao에 접근해서 ArrayList를 가져옴.
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardVo> list = boardDao.boardAllSelect();
		request.setAttribute("list", list);

	}

}
