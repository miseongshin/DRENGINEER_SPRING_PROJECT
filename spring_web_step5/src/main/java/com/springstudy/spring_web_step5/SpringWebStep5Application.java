package com.springstudy.spring_web_step5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringWebStep5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebStep5Application.class, args);
	}

}

