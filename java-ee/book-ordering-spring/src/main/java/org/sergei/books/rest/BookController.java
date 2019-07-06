package org.sergei.books.rest;

import org.sergei.books.jpa.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<List<BookDTO>> findAll() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<BookDTO> saveBook(@RequestBody BookDTO request) {
        return new ResponseEntity<>(bookRepository.createBook(request), HttpStatus.OK);
    }

}
