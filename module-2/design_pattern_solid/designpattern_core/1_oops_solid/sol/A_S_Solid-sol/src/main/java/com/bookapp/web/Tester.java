package com.bookapp.web;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.DataAccessException;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Tester {

	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		//String isbn, String title, String author, double price
		Book book=new Book("AB12", "think and grow rich", "foo", 150.00);
		try{
			bookService.addBook(book);
		}catch(DataAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}
