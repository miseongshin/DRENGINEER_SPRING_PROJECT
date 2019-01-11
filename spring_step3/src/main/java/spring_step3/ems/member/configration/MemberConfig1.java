package spring_step3.ems.member.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_step3.ems.member.dao.StudentDao;
import spring_step3.ems.member.service.StudentAllSelectService;
import spring_step3.ems.member.service.StudentDeleteService;
import spring_step3.ems.member.service.StudentModifyService;
import spring_step3.ems.member.service.StudentSelectService;

@Configuration
public class MemberConfig1 {

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
}
