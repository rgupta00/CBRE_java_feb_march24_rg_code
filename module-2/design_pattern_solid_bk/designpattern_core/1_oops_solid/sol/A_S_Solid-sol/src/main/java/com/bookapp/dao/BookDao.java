package com.bookapp.dao;
import java.util.*;
import com.bookapp.entities.Book;
//ur interface should be tech independent
//nothing but contain crud opeation: autogenerate : spring data
public interface BookDao {
	public List<Book>getAll();
	public void addBook(Book book);
	//
}
