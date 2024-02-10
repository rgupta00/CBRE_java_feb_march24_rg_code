package com.bookapp.dao;
import java.util.List;
import com.bookapp.entities.Book;
import com.bookapp.exceptions.DataAccessException;
import com.bookapp.util.ConnectionFactory;

import java.sql.*;
//BookDaoImpl is rep for getting it dep : connection
public class BookDaoImplJbdc implements BookDao {

	private Connection connection;
	//pull approach	vs push approach (spring DI)
	public BookDaoImplJbdc() {
		connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public List<Book> getAll() {
		return null;
	}

	//jdbc is fast then hiberate : ORM?
	@Override
	public void addBook(Book book) {
		//
		try {
			PreparedStatement pstmt=connection
					.prepareStatement
					("insert into Book (author, isbn, price, title) values (?,?,?,?)");
			
			pstmt.setString(1, book.getAuthor());
			pstmt.setString(2, book.getIsbn());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setString(4, book.getTitle());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			//log the ...
			throw new DataAccessException(e.getMessage());
		}
	}

}
