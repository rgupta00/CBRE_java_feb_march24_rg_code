package com.b_good_code.ocp.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 public class BookService {
	
	//OCP
	//behaviural parametrization 
	//change is the only constant in life
	public static List<Book> getAllBooksByPredicate(List<Book> books, Predicate<Book> predicate) {
		// book> 500
		List<Book> costlyBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (predicate.test(book)) {
				costlyBooks.add(book);
			}
		}
		return costlyBooks;
	}
	
	

}
