package com.drengineer.spring.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.drengineer.spring.member.Member;

@Component
//@Repository
public class MemberDao implements IMemberDao {
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/springtest";
	private String user = "testuser";
	private String password = "1234";

//1. jdbc
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
//2. jdbcTemplate
	//c3p0
	//private DriverManagerDataSource dataSource;
	private DriverManagerDataSource dataSource;	 //예외처리 안해도됨
	private JdbcTemplate jdbcTemplate;

	//jdbc Template 이용
	public  MemberDao() {
/*		//c3p0
 *      dataSource = new DriverManagerDataSource();
		dataSource.setDriverClass(driver);
		dataSource.setJdbcUrl(url);
		dataSource.setUser(user);
		dataSource.setPassword(password);*/
		
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		
		jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
	}
	
	//jdbc
	@Override
	public int memberInsert(Member member) {
		int result =0;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into testmember values(?,?,?,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberMail());
			pstmt.setString(4, member.getPhoneList().get(0).getMemberPhone1());
			pstmt.setString(5, member.getPhoneList().get(1).getMemberPhone1());
			result = pstmt.executeUpdate();
			
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
	public Member memberSelect(final Member member) {
		
		List<Member> memberList = null;
		final String sql = "select * from testuser where lastname = ? AND firstname = ? ";
		memberList = jdbcTemplate.query(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1 , member.getMemberId());
				ps.setString(2 , member.getMemberPw());
				
			}
		}, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				
				member.setMemberId(rs.getString("lastname"));
				member.setMemberPw(rs.getString("firstname"));
				member.setMemberMail(rs.getString("city"));
				
				return member;
			}
		});
		
		if (memberList.isEmpty()) {
			return null;
		}
		
		return memberList.get(0);
	}

}
