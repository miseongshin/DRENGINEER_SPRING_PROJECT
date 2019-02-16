package springtest.spring_web_step3;

import java.util.Date;

public class Book {
    private Date create;
    public BookStatus bookStatus;

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}