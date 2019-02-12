package com.springstudy.spring_web_step5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfigration {
    @Bean
    public BookRepository bookRepository(){
        return new TestBookRepository();
    }
}
