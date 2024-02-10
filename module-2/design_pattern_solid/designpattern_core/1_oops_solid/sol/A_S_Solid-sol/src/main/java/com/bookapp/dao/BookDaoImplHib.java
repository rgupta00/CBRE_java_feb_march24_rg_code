package com.bookapp.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.bookapp.entities.Book;
import com.bookapp.util.HibernateFactory;

public class BookDaoImplHib implements BookDao {

	private SessionFactory sessionFactory;
	
	public BookDaoImplHib() {
		sessionFactory=HibernateFactory.getFactory();
	}
	
	@Override
	public List<Book> getAll() {
		return null;
	}

	@Override
	public void addBook(Book book) {
		System.out.println("book added using hiberate");
	}

}
