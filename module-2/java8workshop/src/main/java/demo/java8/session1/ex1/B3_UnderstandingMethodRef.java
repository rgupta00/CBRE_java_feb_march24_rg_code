package demo.java8.session1.ex1;

import java.util.function.Predicate;
class BookLogic{
    public static  boolean isCostly(Book book){
        return book.getPrice()>=1000;
    }
}
class Book{
    private int id;
    private String name;
    private double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //isntance method
    public   boolean isCostly(){
        return price>=1000;
        //return false;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class B3_UnderstandingMethodRef {

    public static void main(String[] args) {
    //if price is more then 1000 it is costly book
       // Predicate<Book> costlyBook=Book::isCostly;
        Predicate<Book> bookPredicate2=BookLogic::isCostly;

    }
}
