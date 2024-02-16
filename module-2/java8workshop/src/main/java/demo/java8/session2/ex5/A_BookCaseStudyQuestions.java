package demo.java8.session2.ex5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;


public class A_BookCaseStudyQuestions {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();
	//	List<Book> allBooks = new LinkedList<>();
		//0. print all books with authors
//		allBooks.forEach(b-> System.out.println(b));

		// 1. Find books with more then 400 pages
//		List<Book> booksMoreThen400Pages=allBooks.stream().filter(b-> b.getPages()>=400).collect(Collectors.toList());
//
		// 2. Find all books that are java books and more then 400 pages
		Predicate<Book> p1= b-> b.getPages()>400;
		Predicate<Book>p2=b-> b.getSubject()==Subject.JAVA;
		//List<Book> booksMoreThen400PagesAndJava=allBooks.stream().filter(p1.and(p2)).collect(Collectors.toList());

		// 3. We need the top three longest books

		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing years
//		List<Integer> years=allBooks.stream()
//				.map(Book::getYear)
//				.collect(Collectors.toList());
		
		//6. print all the authors: flatMap
		//Stream<Book> bookSteram = allBooks.stream();

//		Stream<Stream<Author>> streamStream = bookSteram.map(b -> b.getAuthors().stream());

		//Stream<Author> streamStream = bookSteram.flatMap(b -> b.getAuthors().stream());

//		allBooks.stream().flatMap(b->b.getAuthors().stream())
//				.forEach(a-> System.out.println(a));


		//7. store origin cournty of authors
//		List<String> allCountries=allBooks
//				.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(Author::getCountry)
//				.distinct()
//				.collect(Collectors.toList());
//
//		allCountries.forEach(c-> System.out.println(c));

		// in,us
		String allCountriesName=allBooks
				.stream()
				.flatMap(b->b.getAuthors().stream())
				.map(Author::getCountry)
				.distinct()
				.collect(joining(","));

		System.out.println(allCountriesName);

		//8. Most recent book published
//		Optional<Book> bookOptional=allBooks
//				.stream()
//				.max(Comparator.comparing(Book::getYear));
//		System.out.println(bookOptional.orElseThrow(()-> new RuntimeException("book not found")));


		//9. want to know if book written by more then one authors
		//t or f
//		boolean b1 = allBooks.stream().allMatch(b -> b.getAuthors().size() > 1);
//		System.out.println(b1);

		//10. want to know if one of book written by more then one author
		//findAny
//		Optional<Book> bookOpt = allBooks.stream().filter(b -> b.getAuthors().size() > 1)
//				.findAny();

		//11. total no of pages published
//		int sum = allBooks.stream()
//				.mapToInt(b -> b.getPages())
//				.sum();
//		System.out.println(sum);

//		Optional<Integer> sumOpt=allBooks.stream()
//				.map(b-> b.getPages())
//				.reduce( (x,y)->x+y);
//		System.out.println(sumOpt.orElse(0));

//		int sumOpt=allBooks.stream()
//				.map(b-> b.getPages())
//				.reduce( 0, (x,y)->x+y);
//		System.out.println(sumOpt);
		//Additive identity vs multiplicative identity

		//12. pages in the longest book
//		allBooks.stream()
//				.mapToInt(Book::getPages)
//				.max();

//		allBooks.stream()
//				.mapToInt(Book::getPages)
//				.reduce(Integer::max);
//		allBooks.stream()
//				.mapToInt(Book::getPages)
//				.reduce((int x, int y) -> x+y);

		//13. avg no of pages

		//14. all titles of books

		//15. book with highest no of authors

		//16. map of books per year
		//Map<Integer, List<Book>>
		Map<Integer, List<Book>> booksPerYearMap = allBooks.stream()
				.collect(groupingBy(Book::getYear));
		booksPerYearMap.entrySet().forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));

		//17. book publish per year per title (subject)

		Map<Integer, Map<Subject, List<Book>>> collect = allBooks.stream()
				.collect(groupingBy(Book::getYear, groupingBy(Book::getSubject)));


		//18. map of book per year



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
				(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays
				.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 300, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
