package com.springstudy.spring_web_stepa10;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {

        //registry.addConverter(new EventConvertor.StringToEventConverter());
        registry.addFormatter(new EventFomatter());

    }
}
