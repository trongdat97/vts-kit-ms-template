package ${package}.repository;

import ${package}.domain.Book;

import java.util.List;

public interface BookRepository {

    Book createBook(Book book);
    Book updateBook(Book book);
    Book deleteBook(String bookId);
    Book getBook(String bookId);
    List<Book> getListBook();
}
