package spring_step3.ems.member.configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_step3.ems.member.DataBaseConnectionInfo;
import spring_step3.ems.member.dao.StudentDao;
import spring_step3.ems.member.service.EMSInformationService;
import spring_step3.ems.member.service.StudentAllSelectService;
import spring_step3.ems.member.service.StudentDeleteService;
import spring_step3.ems.member.service.StudentModifyService;
import spring_step3.ems.member.service.StudentSelectService;

@Configuration
public class MemberConfig {

	/* <bean id="studentDao" class="spring_step3.ems.member.dao.StudentDao" /> */
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}

	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}

	@Bean
	public StudentDeleteService deleteService() {
		return new StudentDeleteService(studentDao());
	}

	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}

	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}
	
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
	
	@Bean
	public EMSInformationService informationService() {
		
		EMSInformationService info= new EMSInformationService();
		
		info.setInfo("Education Managemet System program was deeloped in 2015");
		info.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED");
		info.setVer("The version is 1.0");
		info.setsYear("2015");
		info.setsMonth("1");
		info.setsDay("1");
		
		List<String> employees = new ArrayList<String>();
		employees.add("Cheney.");
		employees.add("Eloy.");
		employees.add("Jasper.");
		employees.add("Dillon.");
		info.setEmployees(employees);
		
		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("cheny", "cheny@springPjt.org");
		administrators.put("Jsper", "Jsper@springPjt.org");
		info.setAdministrators(administrators);
		
		Map<String, DataBaseConnectionInfo> dbInfos= new HashMap<String, DataBaseConnectionInfo>();
		
		dbInfos.put("dev", dbConnectionInfoDev());
		dbInfos.put("real", dbConnectionInfoReal());
		info.setDbInfos(dbInfos);
		
		return info;
	}
}
