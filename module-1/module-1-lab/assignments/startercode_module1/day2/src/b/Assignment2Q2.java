package b;
/*
 * Create a book store application which will help a book store to keep 
 * the record of its books. For each book, 
 * the application will have the Book Title, Book Author, Book ISBN along with the number of copies for each book.
 *  The system will allow you to display all books, 
 *  order new/existing books and sell books.
 *  
 *   With sell or order of existing books,
 *   number of copies will decrease/increase.
 *    
 *   With order of new book, a new book entry will be added to the system. 
 */
public class Assignment2Q2 {

	public static void main(String[] args) {
		BookStore bookStore=new BookStore("harman", 5);
		bookStore.sell("spring in action", 2);
		bookStore.display();
	}
}
