package com.site.ex0721.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.ex0721.BoardVo;
import com.site.ex0721.Vo.BVo;

public class BDao {

	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BoardVo boardVo = null;
	String btitle, bcontent, bname, bupload;
	int bid, bgroup, bstep, bindent, bhit;
	Timestamp bdate;
	
	public ArrayList<BVo> boardList(){
		ArrayList<BVo> list = new ArrayList<BVo>();
		try {
			conn = getConnection();
			String sql="select * from board";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			while(rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bid");
				bstep = rs.getInt("bid");
				bindent = rs.getInt("bid");
				bid = rs.getInt("bid");
				bid = rs.getInt("bid");
				bid = rs.getInt("bid");
				bid = rs.getInt("bid");
				bid = rs.getInt("bid");
				
			}
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	
	
	
	
	
	

	// context접근해서 DataSource Connection객체 1개 가져옴.
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}// getConnection

}
