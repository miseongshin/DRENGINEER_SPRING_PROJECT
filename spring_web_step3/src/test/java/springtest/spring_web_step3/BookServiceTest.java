package springtest.spring_web_step3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class BookServiceTest {

    @Mock
    BookRepository bookRepository;

    @Test
    public void save() {
        Book book = new Book();

        when(bookRepository.save(book)).thenReturn(book);
        //BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        Book result =bookService.save(book);

        assertThat(book.getCreate()).isNotNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();
    }

}