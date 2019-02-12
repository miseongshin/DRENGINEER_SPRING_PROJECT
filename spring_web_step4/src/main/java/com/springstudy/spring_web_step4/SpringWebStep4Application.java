package com.springstudy.spring_web_step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class SpringWebStep4Application {

	@Autowired
	MyService myService;


	public static void main(String[] args) {
		//강의는 VAR 로 사용  java 10
		SpringApplication app = new SpringApplication(SpringWebStep4Application.class);
//		app.addInitializers(new ApplicationContextInitializer<GenericApplicationContext>() {
//			@Override
//			public void initialize(GenericApplicationContext ctx) {
//				ctx.registerBean(MyClass.class);
//			}
//		});
		app.addInitializers(
				(ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
					ctx.registerBean(MyService.class);
					ctx.registerBean(ApplicationRunner.class,()->arg1->System.out.println("Functional Bean Definition"));

				});

		app.run(args);


	}

}

