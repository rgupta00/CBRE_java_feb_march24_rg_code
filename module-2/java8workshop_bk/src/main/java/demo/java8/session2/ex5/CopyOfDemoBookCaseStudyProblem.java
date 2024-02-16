package demo.java8.session2.ex5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
//		List<Book> booksWithMoreThen400Pages= allBooks.stream()
//				.filter(b-> b.getPages()>400)
//				.collect(toList());
//
		// 2. Find all books that are java books and more then 400 pages

//		Predicate<Book>p1=b-> b.getPages()>400;
//		Predicate<Book>p2=b-> b.getSubject()==Subject.JAVA;
//
//		List<Book> booksWithMoreThen400Pages= allBooks.stream()
//				.filter(p1.and(p2))
//				.collect(toList());

//		Comparator<Book> comparator = ( o1,  o2) ->
//				 Integer.compare(o2.getPages(), o1.getPages());



		// 3. We need the top three longest books
//		List<Book> top3Books= allBooks.stream()
//				.sorted(comparator)
//				.limit(3)
//				.collect(toList());

//		List<Book> top3Books= allBooks.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.limit(3)
//				.collect(toList());

		// 4. We need from the fourth to the last longest books

//		List<Book> top3Books= allBooks.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.skip(3)
//				.collect(toList());

		// 5. We need to get all the publishing years
//		List<Integer> booksWithMoreThen400Pages= allBooks.stream()
//				.map(b->b.getYear())
//				.distinct()
//				.collect(toList());

//		Set<Integer> booksWithMoreThen400Pages= allBooks.stream()
//				.map(b->b.getYear())
//				.collect(toSet());

		//print all the authors

//		allBooks.stream()
//				.forEach(b-> System.out.println(b));


//		Stream<Book>allBooksStream=  allBooks.stream();

//		Stream<Stream<Author>>allBooksStream=
//				allBooks.stream()
//						.map(b->b.getAuthors().stream());

//		Stream<Author> allBooksStream=
//				allBooks.stream()
//				.flatMap(b->b.getAuthors().stream())
//						.forEach(a-> System.out.println(a));


		//printing all the authors
//				allBooks.stream()
//						.flatMap(b->b.getAuthors().stream())
//						.forEach(a-> System.out.println(a));

		//printing all the authors
//		allBooks.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(a-> a.getName())
//				.distinct()
//				.forEach(an-> System.out.println(an));

//i want all the authors name , seprated
//	String authors= allBooks.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(a-> a.getName())
//				.distinct()
//				.collect(Collectors.joining(" ,"));
//
//		System.out.println(authors);


		//most recent publish book
//		Optional<Book> opBook=
//				allBooks.stream().min(Comparator.comparing(Book::getYear).reversed());
//		Book book=opBook.orElseThrow(()-> new RuntimeException());
//		System.out.println(book);
		//print all the unique countries of all the authors

		// 6. We need all the authors names who have written a book


		// We want one of the books written by more than one author. (findAny)

		
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.
//		Map<Integer, List<Book>>bookListMap=
//				allBooks.stream()
//						.collect(Collectors.groupingBy(Book::getYear));
//
//		bookListMap.forEach(( k,  v)-> System.out.println("key: "+k+ " : "+ v));
//

		

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays
				.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList
				(new Author("raj", "gupta", "in"),
						new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays
				.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 300, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
