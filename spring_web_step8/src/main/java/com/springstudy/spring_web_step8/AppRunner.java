package com.springstudy.spring_web_step8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ResourceBanner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.util.SortedMap;

@Component
public class AppRunner implements ApplicationRunner {


    @Autowired
    ApplicationContext resourceLoader;
    //ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //AnnotationConfigServletWebServerApplicationContext
        System.out.println(resourceLoader.getClass());


        //Resource resource =  resourceLoader.getResource("classPath:text.txt");
        Resource resource =  resourceLoader.getResource("text.txt");
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        //java 11 System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}
