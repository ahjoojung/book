package company.kakaobank.com.bookSearch.controller;

import company.kakaobank.com.bookSearch.model.BookDto;
import company.kakaobank.com.bookSearch.response.RestResponse;
import company.kakaobank.com.bookSearch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public ResponseEntity<BookDto> search(@RequestParam("title") String title) {
        BookDto book = new BookDto();
        book.setTitle(title + " by ahjoo");
        book.setDescription("ezic");

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

//    @GetMapping("/kakao")
//    public String kakaoConnect(@RequestParam("title") String title) {
//        StringBuffer url = new StringBuffer();
//        url.append("https://dapi.kakao.com/v3/search/book?");
//        url.append("sort=accuracy");
//        url.append("&page=1");
//        url.append("&size=10");
//        url.append("&query=따라하기");
//        url.append("");
//    }



}
