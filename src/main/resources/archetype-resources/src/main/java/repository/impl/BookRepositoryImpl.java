package ${package}.repository.impl;

import ${package}.domain.Book;
import ${package}.repository.BookRepository;
import ${package}.utils.CommonUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private static final Map<String, Book> BOOK_STORE_FAKE = new HashMap<>();

    @PostConstruct
    private void init(){
        addBookToMap(new Book("How Beautiful We Were", "Imbolo Mbue"));
        addBookToMap(new Book("Intimacies", "Katie Kitamura"));
        addBookToMap(new Book("The Love Songs of W.E.B. Du Bois", "Honorée Fanonne Jeffers"));
    }

    private void addBookToMap(Book book){
        BOOK_STORE_FAKE.put(book.getId(), book);
    }

    private void removeBookFromMap(Book book){
        BOOK_STORE_FAKE.remove(book.getId());
    }

    private Book getBookFromMap(String bookId){
        return BOOK_STORE_FAKE.get(bookId);
    }

    private List<Book> getAllBook(){
        return new ArrayList<>(BOOK_STORE_FAKE.values());
    }

    @Override
    public Book createBook(Book book) {
        String bookId = CommonUtils.randomString();
        book.setId(bookId);
        addBookToMap(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        Book updatedBook = getBookFromMap(book.getId());
        if(updatedBook == null){
            return null;
        }
        removeBookFromMap(updatedBook);
        addBookToMap(book);
        return book;
    }

    @Override
    public Book deleteBook(String bookId) {
        Book deletedBook = getBookFromMap(bookId);
        if(deletedBook == null){
            return null;
        }
        removeBookFromMap(deletedBook);
        return deletedBook;
    }

    @Override
    public Book getBook(String bookId) {
        return getBookFromMap(bookId);
    }

    @Override
    public List<Book> getListBook() {
        return getAllBook();
    }
}
