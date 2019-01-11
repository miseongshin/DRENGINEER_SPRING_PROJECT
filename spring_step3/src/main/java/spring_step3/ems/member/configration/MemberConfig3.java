package spring_step3.ems.member.configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_step3.ems.member.DataBaseConnectionInfo;
import spring_step3.ems.member.service.EMSInformationService;

@Configuration
public class MemberConfig3 {

	@Autowired
	DataBaseConnectionInfo dbConnectionInfoDev;

	@Autowired
	DataBaseConnectionInfo dbConnectionInfoReal;

	@Bean
	public EMSInformationService informationService() {

		EMSInformationService info = new EMSInformationService();

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

		Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<String, DataBaseConnectionInfo>();

		dbInfos.put("dev", dbConnectionInfoDev);
		dbInfos.put("real", dbConnectionInfoReal);
		info.setDbInfos(dbInfos);

		return info;
	}

}
