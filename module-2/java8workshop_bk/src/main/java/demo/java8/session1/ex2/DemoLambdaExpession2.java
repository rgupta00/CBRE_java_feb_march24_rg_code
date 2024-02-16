package demo.java8.session1.ex2;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;



public class DemoLambdaExpession2 {

 public static void printMe(String data){
	 System.out.println(data);
 }

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));

		//find all the java books names
		List<String> javaBooks=books
				.stream()
				.map(b-> b.getTitle())
				.filter(title-> title.contains("java"))
				.collect(toList());

	//javaBooks.forEach(title-> System.out.println(title));

		Consumer<String> myConsumer=System.out::print;

		Consumer<String> myConsumer2=DemoLambdaExpession2::printMe;

		javaBooks.forEach(System.out::print);

		long javaBooksCounter=books
				.stream()
				.map(b-> b.getTitle())
				.filter(title-> title.contains("java"))
				.count();
		System.out.println(javaBooksCounter);


	}
}
