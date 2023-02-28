package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.BookEntity;
import com.example.demo.repo.BookRepo;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public BookEntity getBookById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    public BookEntity saveBook(BookEntity book) {
        return bookRepo.save(book);
    }

    public BookEntity updateBook(BookEntity book) {
        BookEntity existingBook = bookRepo.findById(book.getId()).orElse(null);
        if (existingBook == null) {
            return null;
        }
        existingBook.setBookName(book.getBookName());
        existingBook.setPrice(book.getPrice());
        existingBook.setQuantity(book.getQuantity());
        existingBook.setAuthorName(book.getAuthorName());
        return bookRepo.save(existingBook);
    }

    public String deleteBook(int id) {
        bookRepo.deleteById(id);
        return "Book removed !! " + id;
    }

}
