package com.drengineer.spring.config;

import java.beans.PropertyVetoException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//@Configuration
public class DBConfig {
	
	final private String driverClass = "org.mariadb.jdbc.Driver";
	final private String jdbcUrl = "jdbc:mariadb://localhost:3306/springtest";
	final private String user = "testuser";
	final private String password = "1234";
	final private int maxPoolSize = 60000;
	final private int checkoutTimeout = 18000;
	final private int idleConnectionTestPeriod = 600;
	

	//@Bean
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setMaxPoolSize(maxPoolSize);
		dataSource.setCheckoutTimeout(checkoutTimeout);
		dataSource.setIdleConnectionTestPeriod(idleConnectionTestPeriod);
		
		return dataSource;
	}
}
