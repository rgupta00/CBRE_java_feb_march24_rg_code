package demo.java8.session1.ex4;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private String author;
	private double price;

	public boolean isCoslty(){
		return price>=500;
	}
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.getId(), o.getId());
	}
}
