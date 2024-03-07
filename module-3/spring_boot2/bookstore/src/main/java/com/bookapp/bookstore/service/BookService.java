package com.bookapp.bookstore.service;

import com.bookapp.bookstore.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public List<Book> getAll();
    public Book getBookById(Long bookId);
    public Book addBook(Book book);
    public Book updateBook(Long bookId, Book book);
    public Book removeBook(Long bookId);
    public Book getByIsbn(String isbn);
}
