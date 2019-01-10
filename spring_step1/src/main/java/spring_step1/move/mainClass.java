package spring_step1.move;

import org.springframework.context.support.GenericXmlApplicationContext;

public class mainClass {

	public static void main(String[] args) {
		
		//Transportation transportationWalk = new Transportation();
		//transportationWalk.walk();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		Transportation tWork = ctx.getBean("tWork",Transportation.class );	
		tWork.walk();
		
		ctx.close();
		
	}
}
