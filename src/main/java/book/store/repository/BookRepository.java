package book.store.repository;

import book.store.model.Book;
import java.util.List;

public interface RepositoryBook {
    Book save(Book book);

    List<Book> findAll();
}
