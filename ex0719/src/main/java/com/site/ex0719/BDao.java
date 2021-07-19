package com.site.ex0719;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BDao {
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	//Connection객체 연결-db연결 dbURL,dbID,dbPW
	public Connection getConnection() throws Exception {
		//Context객체 생성
		Context context = new InitialContext();
		//context에 있는 jdbc/Oracle11g라는 이름을 가진 DataSource를 가져오기
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		//Connection 1개를 가져오기
		return ds.getConnection();
	}
	
	// 게시판 전체 리스트 메소드
	public ArrayList<BDto> boardList(){
		ArrayList<BDto> list = new ArrayList<BDto>();
		try {
			conn = getConnection(); //Connection메소드 호출
			String sql="select * from board";
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();  //rs 
			while(rs.next()) {
				BDto bDto = new BDto();
				bDto.setBid(rs.getInt("bid"));
				bDto.setBtitle(rs.getString("btitle"));
				bDto.setBcontent(rs.getString("bcontent"));
				bDto.setBname(rs.getString("bname"));
				bDto.setBgroup(rs.getInt("bgroup"));
				bDto.setBstep(rs.getInt("bstep"));
				bDto.setBindent(rs.getInt("bindent"));
				bDto.setBdate(rs.getTimestamp("bdate"));
				bDto.setBupload(rs.getString("bupload"));
				bDto.setBhit(rs.getInt("bhit"));
				list.add(bDto);
			}
			
		  	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	
	
	

}
