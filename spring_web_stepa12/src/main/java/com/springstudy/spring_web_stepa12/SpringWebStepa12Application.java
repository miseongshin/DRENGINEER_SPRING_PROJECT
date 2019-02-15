package com.springstudy.spring_web_stepa12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebStepa12Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringWebStepa12Application.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
		//SpringApplication.run(SpringWebStepa12Application.class, args);
	}

}

