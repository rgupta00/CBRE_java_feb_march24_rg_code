package b;

public class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private int numOfCopies;

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public Book(String bookTitle, String author, String isbn, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println("---book details------");
		System.out.println("bookTitle: " + bookTitle);
		System.out.println("author: " + author);
		System.out.println("isbn: " + isbn);
		System.out.println("numOfCopies: " + numOfCopies);
		System.out.println("---------------------");

	}
}
