package springtest.spring_web_step3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Clock;
import java.util.Arrays;

@SpringBootApplication
public class SpringWebStep3Application {

	public static void main(String[] args)
	{
		ApplicationContext context =new AnnotationConfigApplicationContext(ApplicationConfig.class);

		//ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		BookService bookService = (BookService) context.getBean("bookService");
		System.out.println(bookService.bookRepository !=null);
	}

}

