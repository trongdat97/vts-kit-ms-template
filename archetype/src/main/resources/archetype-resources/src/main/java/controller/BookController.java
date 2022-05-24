package ${package}.controller;

import com.viettel.vtskit.common.rest.AbstractRestController;
import com.viettel.vtskit.common.utils.InternationalizationUtils;
import com.viettel.vtskit.common.utils.RestUtils;
import ${package}.dto.BookDTO;
import ${package}.dto.UpdateBookDTO;
import ${package}.service.BookService;
import ${package}.service.impl.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController extends AbstractRestController {

    private BookService bookService;

    @PostMapping("/edit/createBook")
    public ResponseEntity<Object> createBook(@Valid @RequestBody BookDTO bookInfo) {
        return RestUtils.responseOk(bookService.createBook(bookInfo));
    }

    @PostMapping("/edit/updateBook")
    public ResponseEntity<Object> updateBook(@Valid @RequestBody UpdateBookDTO bookInfo) {
        BookDTO rsUpdate = bookService.updateBook(bookInfo);
        if(rsUpdate == null){
            return RestUtils.response404(InternationalizationUtils.getMessage("msg.error.notFound"));
        }
        return RestUtils.responseOk(rsUpdate);
    }

    @PostMapping("/edit/deleteBook/{bookId}")
    public ResponseEntity<Object> deleteBook(@PathVariable("bookId") String bookId) {
        BookDTO rsDelete = bookService.deleteBook(bookId);
        if(rsDelete == null){
            return RestUtils.response404(InternationalizationUtils.getMessage("msg.error.notFound"));
        }
        return RestUtils.responseOk(rsDelete);
    }

    @GetMapping("/view/getBookDetail/{bookId}")
    public ResponseEntity<Object> getBookDetail(@PathVariable("bookId") String bookId) {
        BookDTO rsDelete = bookService.getBookDetail(bookId);
        if(rsDelete == null){
            return RestUtils.response404(InternationalizationUtils.getMessage("msg.error.notFound"));
        }
        return RestUtils.responseOk(rsDelete);
    }

    @GetMapping("/view/getListBook")
    public ResponseEntity<Object> getListBook() {
        return RestUtils.responseOk(bookService.getListBook());
    }

    @Autowired
    public void setBookService(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

}
