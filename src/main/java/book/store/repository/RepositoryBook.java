package mate.academy.repository;

import java.util.List;
import mate.academy.model.Book;

public interface RepositoryBook {
    Book save(Book book);

    List<Book> findAll();
}
