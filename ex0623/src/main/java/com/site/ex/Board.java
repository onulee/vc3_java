package com.site.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	private int num;
	private String title;
	private String contents;
	private String name;
	private int hit;
	private String rDate;
	
	public Board() { }
	public Board(int num, String title, String contents, String name, int hit) {
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.name = name;
		this.hit = hit;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		rDate = sdf.format(today);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRdate() {
		return rDate;
	}
	public void setRDate(String date) {
		this.rDate = rDate;
	}
	
	

	
	
	
	

}
