package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.BookEntity;
import com.example.demo.service.BookService;

@RestController
public class ApiController {
    private final BookService bookService;

    public ApiController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public BookEntity getBookById(int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/book")
    public BookEntity saveBook(BookEntity book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/book/update")
    public BookEntity updateBook(BookEntity book) {
        return bookService.updateBook(book);
    }

    @GetMapping("/book/delete")
    public String deleteBook(int id) {
        return bookService.deleteBook(id);
    }
}
