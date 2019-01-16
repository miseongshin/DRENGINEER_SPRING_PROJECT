package com.drengineer.spring.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.drengineer.spring.member.Member;

@Component
//@Repository
public class MemberDao implements IMemberDao {
	private String url = "org.mariadb.jdbc.Driver";
	private String driver = "jdbc:mysql://localhost:3306/springtest";
	private String user = "testuser";
	private String password = "1234";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	@Override
	public int memberInsert(Member member) {
		int result =0;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into testmember values(?,?,?,?,'')";
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberMail());
			pstmt.setString(4, member.getMemberMail());
			result = pstmt.executeUpdate(sql);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt !=null) pstmt.close();
				if (conn !=null) conn.close();
				 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
	}

	@Override
	public void memberSelect(Member member) {
		// TODO Auto-generated method stub

	}

}
