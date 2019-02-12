package com.springstudey.spring_web_step6;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.LocalElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.Locale;
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;
    //ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        while (true){
            System.out.println(messageSource.getClass());
            System.out.println(messageSource.getMessage("greeting", new String[]{"Seong"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Seong"}, Locale.ENGLISH));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Seong"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }
    }
}
