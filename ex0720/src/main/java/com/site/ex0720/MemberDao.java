package com.site.ex0720;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemberVo memberVo=null;
	String id,pw,name,nickName,gender,tel,address1,address2,hobby;
	
	//회원정보 1개를 가져옴
	public MemberVo memberOneSelect(String userId) {
			
		try {
			conn = getConnection();
			String sql = "select * from member2 where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				nickName = rs.getString("nickName");
				gender = rs.getString("gender");
				tel = rs.getString("tel");
				address1 = rs.getString("address1");
				address2 = rs.getString("address2");
				hobby = rs.getString("hobby");
			    memberVo = new MemberVo(id,pw,name,nickName,gender,tel,address1,address2,hobby);
			}
		} catch (Exception e) {
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
		return memberVo;
	}
	
	//Context에서 Connection객체 1개를 가져옴.
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}
	

}
