package mate.academy.service;

import java.util.List;
import mate.academy.model.Book;

public interface ServiceBook {
    Book save(Book book);

    List<Book> findAll();
}
