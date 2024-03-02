package com.bookapp.bookstore.dao.impl;

import com.bookapp.bookstore.dao.Book;
import com.bookapp.bookstore.dao.BookDao;
import com.bookapp.bookstore.exceptions.BookNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class BookDaoImplUsingMap implements BookDao {
	private static Map<Long, Book> books=new HashMap<Long, Book>();
	static {
		books.put(1L, new Book(1L, "ABC123", "head first", "katthy", 500.00));
		books.put(2L, new Book(1L, "ABU123", "thinking in java", "amit", 400.00));
	}

	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book getBookById(Long bookId) {
		Book book= books.get(bookId);
		if(book==null)
			throw new BookNotFoundException("book with id "+ bookId +" is not found");

		return book;
	}

	@Override
	public Book addBook(Book book) {
		book.setId((long) (books.size()+1));
		books.put(book.getId(), book);
		return book;
	}

	@Override
	public Book updateBook(Long bookId, Book book) {
		Book bookToUpdate= getBookById(bookId);
		bookToUpdate.setPrice(book.getPrice());
		books.put(bookId, bookToUpdate);

		return bookToUpdate;
	}

	@Override
	public Book removeBook(Long bookId) {
		Book bookToRemove=getBookById(bookId);
		books.remove(bookId);
		return bookToRemove;
	}

}
