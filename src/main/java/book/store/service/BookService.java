package book.store.service;

import book.store.model.Book;
import java.util.List;

public interface ServiceBook {
    Book save(Book book);

    List<Book> findAll();
}
