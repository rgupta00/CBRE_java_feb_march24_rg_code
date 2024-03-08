package com.bookapp.bookstore;

import com.bookapp.bookstore.service.BookService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
What is the user of CommandLineRunner
it give opp to do something just after spring boot init
 */
@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	@Autowired
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//public Book(String isbn, String title, String author, double price)
		//bookService.addBook(new Book("A1ZX","java basics","raj",700));
	}
}
