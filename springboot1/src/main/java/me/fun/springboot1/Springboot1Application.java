package me.fun.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Springboot1Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

/*    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman();
        holoman.setName("whiteship");
        holoman.setHowLong(60);
        return holoman;
    }*/

}
