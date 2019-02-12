package spring_web_step2.com.book.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

/*@RunWith(SpringRunner.class)*/
public class BookServiceTest {

//	@Mock
//	BookRepository bookRepository;
	@Test
	public void test() {
		
		Book book = new Book();
		
//		when(bookRepository.save(book)).thenReturn(book);
//		BookService bookService = new BookService(bookRepository);
//		
//		Book result = bookService.save(book);
		
		assertThat(book.getCreated(), is(nullValue()));
		assertThat(book.getBookStatus(), is(BookStatus.DRAFT));
		
//		assertThat(result, is(notNullValue()));
	}

}
