package com.demo3;

import java.util.*;
import java.util.function.Predicate;

public class BookServiceBad {
	
	//OCP
	
	//change is the only constant in life
	public static List<Book> getAllBooksThatAreCostly(List<Book> books) {
		// book> 500
		List<Book> costlyBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getPrice() >= 500) {
				costlyBooks.add(book);
			}
		}
		return costlyBooks;
	}
	
	public static List<Book> getAllBooksThatAreJavaBooks(List<Book> books) {
		// all java book
		List<Book> costlyBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getTitle().contains("java")) {
				costlyBooks.add(book);
			}
		}
		return costlyBooks;
	}

}
