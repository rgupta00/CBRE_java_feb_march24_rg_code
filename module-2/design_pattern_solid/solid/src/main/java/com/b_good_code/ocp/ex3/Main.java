package com.b_good_code.ocp.ex3;

import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		//public Book(String isbn, String title, String author, double price)
		List<Book> books=Arrays.asList(
				new Book("1212", "java effective", "foo", 400),
				new Book("129", "power of subconsious mind", "foo", 600)
				);
		
//		List<Book> selectedBooks=BookService.getAllBooksByPredicate(books, 
//				book-> book.getPrice()>=500);
//		
//		selectedBooks.forEach(b-> System.out.println(b));
		
		List<Book> selectedBooksAllJava= BookService.getAllBooksByPredicate(books,
				book-> book.getTitle().contains("java"));
		
		selectedBooksAllJava.forEach(b-> System.out.println(b));
	}
}
