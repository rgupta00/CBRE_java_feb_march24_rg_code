package com.bookapp.bookstore.service;

import com.bookapp.bookstore.dao.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAll();
    public Book getBookById(Long bookId);
    public Book addBook(Book book);
    public Book updateBook(Long bookId, Book book);
    public Book removeBook(Long bookId);
}
