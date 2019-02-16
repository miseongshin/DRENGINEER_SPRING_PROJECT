package springtest.spring_web_step3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book){
        book.setCreate(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("==========");
        System.out.println("Hello");
    }
}
