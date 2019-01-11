package spring_step2.customers;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring_step2.customers.integration.DataBaseConnectionInfoReal;
import spring_step2.customers.service.AdministratorsService;
import spring_step2.customers.service.EmployeesService;

public class mainClass {
	public static void main(String[] args) {

		String[] appCtxs = { "classpath:applicationContext.xml",
				// "classpath:spring_customers-spring.xml",
		};

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(appCtxs);
		DataBaseConnectionInfoReal dbConnection = ctx.getBean("dbConnectionInfoReal", DataBaseConnectionInfoReal.class);
		System.out.println(dbConnection.getJdbcUrl());

		AdministratorsService administratorsService = ctx.getBean("administratorsService", AdministratorsService.class);
		Map<String, String> administrators = administratorsService.getAdministrators();
		System.out.println(administrators.get("dev"));

		EmployeesService employeesService = ctx.getBean("employeesService", EmployeesService.class);
		List<String> employees = employeesService.getEmployees();
		System.out.println(employees.get(1));
		
		
		ctx.close();

	}
}
