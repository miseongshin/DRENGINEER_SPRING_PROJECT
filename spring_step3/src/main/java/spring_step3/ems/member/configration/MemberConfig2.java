package spring_step3.ems.member.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_step3.ems.member.DataBaseConnectionInfo;

@Configuration
public class MemberConfig2 {

	@Bean
	public DataBaseConnectionInfo dbConnectionInfoDev() {
		
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
		
		infoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		infoDev.setUserId("scott");
		infoDev.setUserPw("tiger");
		
		return infoDev;
	}
	
	@Bean
	public DataBaseConnectionInfo dbConnectionInfoReal() {
		
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
		
		infoDev.setJdbcUrl("jdbc:oracle:thin:XXX.XXX.XXX:11000:xe");
		infoDev.setUserId("scott");
		infoDev.setUserPw("tiger");
		
		return infoDev;
	}

}
