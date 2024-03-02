package com.bookapp.bookstore.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAll();
	public Book getBookById(Long bookId);
	public Book addBook(Book book);
	public Book updateBook(Long bookId, Book book);
	public Book removeBook(Long bookId);
	
}