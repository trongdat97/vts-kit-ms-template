package ${package}.service.impl;

import ${package}.domain.Book;
import ${package}.dto.BookDTO;
import ${package}.dto.UpdateBookDTO;
import ${package}.mapper.BookMapper;
import ${package}.repository.BookRepository;
import ${package}.repository.impl.BookRepositoryImpl;
import ${package}.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDTO createBook(BookDTO book) {
        Book newBook = bookMapper.toSrc(book);
        return bookMapper.toDest(bookRepository.createBook(newBook));
    }

    @Override
    public BookDTO updateBook(UpdateBookDTO book) {
        Book updatedBook = bookMapper.toSrc(book);
        return bookMapper.toDest(bookRepository.updateBook(updatedBook));
    }

    @Override
    public BookDTO deleteBook(String bookId) {
        return bookMapper.toDest(bookRepository.deleteBook(bookId));
    }

    @Override
    public BookDTO getBookDetail(String bookId) {
        return bookMapper.toDest(bookRepository.getBook(bookId));
    }

    @Override
    public List<BookDTO> getListBook() {
        return bookMapper.toDest(bookRepository.getListBook());
    }

    @Autowired
    public void setBookRepository(BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

}
