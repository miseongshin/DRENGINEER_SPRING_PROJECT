package com.springstudy.spring_web_step4;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService implements InitializingBean {

//    @Autowired
//    BookRepository bookRepository;

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

//    @Autowired(required = false)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    @Autowired
    List<BookRepository> bookRepositories;
    public void printBookRepository(){
        //this.bookRepositories.forEach(s ->System.out.println(s.getClass()) );
        this.bookRepositories.forEach(System.out::println);
        //System.out.println(bookRepository.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void setUp(){
        System.out.println("PostConstruct");
    }
}
