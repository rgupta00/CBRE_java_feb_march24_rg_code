//package com.bookapp.bookstore.dao.impl;
//
//import com.bookapp.bookstore.dao.Book;
//import com.bookapp.bookstore.dao.BookDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.LinkedList;
//import java.util.List;
////@Primary
//@Repository
//public class BookDaoImplUsingJdbc implements BookDao {
//
//    //DriverMager.getConnection vs DataSource (Connection pooling)
//    private DataSource dataSource;
//
//    @Autowired
//    public BookDaoImplUsingJdbc(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Override
//    public List<Book> getAll() {
//        List<Book> books=new LinkedList<>();
//        Book book;
//        //i want to get all the records
//       try{
//           Connection connection=dataSource.getConnection();
//
//           PreparedStatement pstmt=connection.prepareStatement("select * from books");
//           ResultSet rs=pstmt.executeQuery();
//           while (rs.next()){
//               books.add(new Book(
//                       rs.getInt("id"),
//                       rs.getString(2),
//                       rs.getString(3),
//                       rs.getString(4),
//                       rs.getDouble(5)));
//           }
//       }catch (SQLException ex){
//           ex.printStackTrace();
//       }
//
//        return books;
//    }
//
//    @Override
//    public Book getBookById(Long bookId) {
//        return null;
//    }
//
//    @Override
//    public Book addBook(Book book) {
//        try{
//            Connection connection=dataSource.getConnection();
//
//            PreparedStatement pstmt=connection.prepareStatement("insert into books(isbn,title,author,price) values(?,?,?,?)");
//            pstmt.setString(1, book.getIsbn());
//            pstmt.setString(2, book.getTitle());
//            pstmt.setString(3, book.getAuthor());
//            pstmt.setDouble(4, book.getPrice());
//
//            pstmt.executeUpdate();
//        }catch (SQLException ex){
//            ex.printStackTrace();
//        }
//        return book;
//    }
//
//    @Override
//    public Book updateBook(Long bookId, Book book) {
//        return null;
//    }
//
//    @Override
//    public Book removeBook(Long bookId) {
//        return null;
//    }
//}
