package com.bookapp.service;

import java.util.List;

import com.bookapp.entities.Book;

public interface BookService {
	public List<Book>getAll();
	public void addBook(Book book);
}
