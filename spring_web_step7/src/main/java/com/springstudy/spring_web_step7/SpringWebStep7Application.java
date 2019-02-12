package com.springstudy.spring_web_step7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringWebStep7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebStep7Application.class, args);
	}

}

