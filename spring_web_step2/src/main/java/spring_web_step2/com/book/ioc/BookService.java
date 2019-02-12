package spring_web_step2.com.book.ioc;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Book save(Book book) {
		book.setCreated(new Date());
		book.setBookStatus(BookStatus.DRAFT);
		return bookRepository.save(book);
	}

	/*@PostConstruct*/
}
