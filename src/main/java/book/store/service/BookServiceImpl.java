package book.store.service;

import book.store.model.Book;
import book.store.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository repositoryBook;

    @Override
    public Book save(Book book) {
        return repositoryBook.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repositoryBook.findAll();
    }
}
