package org.sergei.books.rest;

import org.sergei.books.jpa.Book;
import org.sergei.books.jpa.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sergei Visotsky
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<Book> findAll() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Book> saveBook(@RequestBody BookDTO book) {
        bookRepository.createBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
