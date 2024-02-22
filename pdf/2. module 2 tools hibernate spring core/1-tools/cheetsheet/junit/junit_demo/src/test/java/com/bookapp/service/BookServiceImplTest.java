package com.bookapp.service;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

class BookServiceImplTest {

	private BookDao bookDao;
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		bookDao=new BookDaoImpl();
		bookService=new BookServiceImpl();
		bookService.setBookDao(bookDao);
	}


	@Test
	void test() {
		List<String> books=bookService.getBooks("java");
		Assertions.assertEquals(2, books.size());
	}
	

	@AfterEach
	void tearDown() throws Exception {
		bookDao=null;
		bookService=null;
	}

}
