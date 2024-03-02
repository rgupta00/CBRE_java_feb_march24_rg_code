package com.bookapp.bookstore.service;

import com.bookapp.bookstore.exceptions.BookNotFoundException;
import com.bookapp.bookstore.entities.Book;
import com.bookapp.bookstore.repo.BookRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional //it will help to achive declartive tx mgt ,It use AOP under the hood , around advice
public class BookServiceImpl implements BookService{

    private BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }
    @Override
    public Book getBookById(Long bookId) {
        return bookRepo.findById(bookId).orElseThrow(()->new BookNotFoundException(" book with id "+ bookId+" not found"));
    }

    @Override
    public Book addBook(Book book) {
       bookRepo.save(book);//in spring data method remain same in case of update / add op
       return book;
    }

    @Override
    public Book updateBook(Long bookId, Book book) {
        Book bookToUpdate= getBookById(bookId);
        bookToUpdate.setPrice(book.getPrice());
        bookRepo.save(book);
        return book;
    }

    @Override
    public Book removeBook(Long bookId) {
        Book bookToDelete= getBookById(bookId);
        bookRepo.delete(bookToDelete);
        return bookToDelete;

    }

    @Override
    public Book getByIsbn(String isbn) {
        return bookRepo.findByIsbn(isbn).orElseThrow(()->new BookNotFoundException(" book with isbn "+ isbn+" not found"));
    }


}
