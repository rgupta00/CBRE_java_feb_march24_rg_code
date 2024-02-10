package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplJbdc;
import com.bookapp.entities.Book;

//BookServiceImpl---------->BookDaoImplJbdc
public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImplJbdc();	//No: pull
	}
	
	@Override
	public List<Book> getAll() {
			return bookDao.getAll();
	}

	@Override
	public void addBook(Book book) {
		//valation		Wow! CCC(Cross cutting)
		//tx
		//sec
		//logging
		//caching
		bookDao.addBook(book);
	}

}
