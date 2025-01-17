package mate.academy.service;

import java.util.List;
import mate.academy.model.Book;
import mate.academy.repository.RepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBookImpl implements ServiceBook {

    private RepositoryBook repositoryBook;

    @Autowired
    public ServiceBookImpl(RepositoryBook bookRepository) {
        this.repositoryBook = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return repositoryBook.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repositoryBook.findAll();
    }
}
