package book.store.service;

import book.store.dto.BookDto;
import book.store.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto createBookRequestDto);

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
