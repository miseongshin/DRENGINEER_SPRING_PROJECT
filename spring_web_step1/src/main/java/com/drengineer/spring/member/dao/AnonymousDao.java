package com.drengineer.spring.member.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.drengineer.spring.member.Member;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class AnonymousDao implements IAnonymousDao{

	
	//3. connection pool
	
/*	final private String driver = "org.mariadb.jdbc.Driver";
	final private String jdbcUrl = "jdbc:mariadb://localhost:3306/springtest";
	final private String user = "testuser";
	final private String password = "1234";*/
	
	/*private ComboPooledDataSource dataSource;*/
	@Autowired
	private JdbcTemplate template;
	
	public AnonymousDao(ComboPooledDataSource dataSource) {
		
/*		dataSource = new ComboPooledDataSource();
		
		try {
			
			dataSource.setDriverClass(driver);
			dataSource.setJdbcUrl(jdbcUrl);
			dataSource.setUser(user);
			dataSource.setPassword(password);
			
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
*/		
		template = new JdbcTemplate(dataSource);
	}

	@Override
	public int anonymousUpdate(Member member) {
		int result = 0;
		
		String sql = "insert into testmember values(?,?,?,?,?)";
		result = template.update(sql, member.getPhoneList().get(0).getMemberPhone3());;
		
		
		return result;
	}
	
	
	
	
}
