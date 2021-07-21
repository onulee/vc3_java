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
	BVo bVo = null;
	String btitle, bcontent, bname, bupload;
	int bid, bgroup, bstep, bindent, bhit;
	Timestamp bdate;

	// 게시글 1개 저장
	public int boardWrite(String bname, String btitle, String bcontent, String bupload) {
		int result = 0;
		try {
			conn = getConnection();
			String sql = "insert into board values(board_seq.nextval,?,?,?,board_seq.currval,0,0,sysdate,?,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bname);
			pstmt.setString(4, bupload);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}// boardWrite

	// 게시판 1개 가져오기
	public BVo boardOneList(int bid) {
		try {
			conn = getConnection();
			String sql = "select * from board where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit = rs.getInt("bhit");
				bVo = new BVo(bid, btitle, bcontent, bname, bgroup, bstep, bindent, bdate, bupload, bhit);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return bVo;
	}// boardOneList

	// 게시판 전체리스트 가져오기
	public ArrayList<BVo> boardAllList() {
		ArrayList<BVo> list = new ArrayList<BVo>();
		try {
			conn = getConnection();
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit = rs.getInt("bhit");
				bVo = new BVo(bid, btitle, bcontent, bname, bgroup, bstep, bindent, bdate, bupload, bhit);
				list.add(bVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}// boardAllList

	// context접근해서 DataSource Connection객체 1개 가져옴.
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}// getConnection

}
