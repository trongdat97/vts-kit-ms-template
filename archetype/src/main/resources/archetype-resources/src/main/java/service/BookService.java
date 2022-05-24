package ${package}.service;

import ${package}.dto.BookDTO;
import ${package}.dto.UpdateBookDTO;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO book);
    BookDTO updateBook(UpdateBookDTO book);
    BookDTO deleteBook(String bookId);
    BookDTO getBookDetail(String bookId);
    List<BookDTO> getListBook();
}
