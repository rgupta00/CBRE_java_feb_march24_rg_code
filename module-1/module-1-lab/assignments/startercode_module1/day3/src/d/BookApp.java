package d;

import java.util.*;
import java.io.*;

public class BookApp {
	private List<Book> books;

	public BookApp() {
		books = new ArrayList<Book>();
		init();
	}

	// reading the data from the file and populating the arraylist
	private void init() {
		String line = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(":");
				Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
						Integer.parseInt(tokens[4]));
				books.add(book);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book searchBook(int bookId) {
		boolean isFond = false;
		Book bookFound = null;
		for (Book book : books) {
			if (book.getId() == bookId) {
				isFond = true;
				bookFound = book;
				break;
			}
		}
		if (isFond)
			return bookFound;
		else
			throw new BookNotFoundException();
	}

	public void sellBook(String isbn, int noOfCopies) {
	}

	public void purchageBook(String isbn, int noOfCopies) {

	}

}
