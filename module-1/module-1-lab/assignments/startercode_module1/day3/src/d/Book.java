package d;

public class Book {
	private int id;
	private String sbn;
	private String title;
	private String author;
	private int price;

	public Book(int id, String sbn, String title, String author, int price) {
		this.id = id;
		this.sbn = sbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getSbn() {
		return sbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", sbn=" + sbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
}
