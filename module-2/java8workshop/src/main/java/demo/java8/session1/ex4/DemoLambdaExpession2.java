package demo.java8.session1.ex4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;



public class DemoLambdaExpession2 {

 public static void printMe(String data){
	 System.out.println(data);
 }

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300),
						new Book(191, "adv java", "raj", 940));

		//understanding page 37
		//give me list of top 2 books as per price
		List<Book> seletedBooks=books.stream()
						.sorted(Comparator.comparing(Book::getPrice).reversed())
						.skip(1).limit(3).collect(toList());
		seletedBooks.forEach(b-> System.out.println(b));




		//i want to print it
		//java 8
		//books.forEach(b-> System.out.println(b));

//		//print all the books having price more then 500
//		books.stream().filter(b->b.getPrice()>=500).forEach(b-> System.out.println(b));

		//print all the books having price more then 500 and writen by raj
//		Predicate<Book> p1=b->b.getPrice()>=500;
//		Predicate<Book> p2=b->b.getAuthor().contains("raj");
//
//		Predicate<Book> p3=p1.or(p2);
//
//		books.stream().filter(p3).forEach(b-> System.out.println(b));

		//i wnat to print the name of all the books having cost more then 500
//		books.stream().filter(b-> b.getPrice()>=500)
//				.map(b->b.getTitle())
//				.forEach(title-> System.out.println(title));

		//i wnat to print the name, price both of all the books having cost more then 500

		//Function<Book, BookData> function= book-> new BookData(book.getTitle(), book.getPrice());

//		books.stream().filter(b-> b.getPrice()>=500)
//				.map(b->new BookData(b.getTitle(), b.getPrice()))
//				.forEach(title-> System.out.println(title));


		//i want all books names sorted
//		books.stream().sorted().forEach(b-> System.out.println(b));

//		Comparator<Book> bookComparator=( o1,  o2)-> o1.getTitle().compareTo(o2.getTitle());
//
//		books.stream().sorted(bookComparator).forEach(b-> System.out.println(b));

		//lambda --> method ref is a shortcut to write the lambda
		//books.stream().sorted(Comparator.comparing(Book::getTitle)).forEach(b-> System.out.println(b));

	}
}
