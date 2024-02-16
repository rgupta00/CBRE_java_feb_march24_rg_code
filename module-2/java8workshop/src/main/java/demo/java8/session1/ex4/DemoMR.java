package demo.java8.session1.ex4;

import java.util.function.Predicate;

public class DemoMR {
    public static void main(String[] args) {
        Predicate<Book> p1=Book::isCoslty;
        Book book=new Book(1,"java","raj",7000);
        System.out.println(p1.test(book));
    }
}
