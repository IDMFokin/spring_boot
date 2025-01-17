package mate.academy.service;

import java.util.List;
import mate.academy.model.Book;
import mate.academy.repository.RepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private RepositoryBook bookRepository;

    @Autowired
    public BookServiceImpl(RepositoryBook bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
