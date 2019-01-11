package spring_step3.ems.member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_step3.ems.member.configration.MemberConfig;
import spring_step3.ems.member.service.EMSInformationService;

public class MainClassUseConfigration {

	public static void main(String[] args) {

		String[] nNums = {"2340792374", "234079237d", "23407923we", "23407923ewf"};
		String[] sIds = {"e1", "e2", "e3", "e4"};
		String[] sPws = {"1234", "1234", "1234", "1234"};
		String[] sNames = {"가가가","나나나", "다다다", "라라라" };
		int[] sAges = {22, 24, 22, 32};
		String[] sGenders = {"M", "M", "W", "W"};
		String[] sMajors = {"Math", "History", "Economics", "Law"};
		
		//StudentAssembler assembler = new StudentAssembler();
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig.class);
		
		
		EMSInformationService informationService = ctx.getBean("informationService",EMSInformationService.class );	
		System.out.println(informationService.outputEmsInformation());
		
		ctx.close();
		
	}
}
