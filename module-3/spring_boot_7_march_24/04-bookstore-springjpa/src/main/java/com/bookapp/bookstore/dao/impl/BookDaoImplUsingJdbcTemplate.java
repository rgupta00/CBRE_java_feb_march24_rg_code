package com.bookapp.bookstore.dao.impl;

import com.bookapp.bookstore.dao.Book;
import com.bookapp.bookstore.dao.BookDao;
import com.bookapp.bookstore.dao.BookRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

//@Primary
@Repository
public class BookDaoImplUsingJdbcTemplate implements BookDao {

    //DriverMager.getConnection vs DataSource (Connection pooling)
   private JdbcTemplate jdbcTemplate;

   @Autowired
    public BookDaoImplUsingJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //RowMapper is only req for get operation
    @Override
    public List<Book> getAll() {
        return jdbcTemplate.query("select * from books", new BookRowMapper());
        //if the colums and pojo are in syn (all fields are same)
       // return jdbcTemplate.query("select * from books", new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public Book getBookById(Long bookId) {
        return jdbcTemplate.queryForObject("select * from books where id=?" ,new BookRowMapper(), bookId);
    }

    @Override
    public Book addBook(Book book) {
       //insert into books(isbn,title,author,price) values(?,?,?,?)
        jdbcTemplate.update("insert into books(isbn,title,author,price) values(?,?,?,?)",
                new Object[]{book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPrice()});
        return book;
    }

    @Override
    public Book updateBook(Long bookId, Book book) {
        return null;
    }

    @Override
    public Book removeBook(Long bookId) {
        return null;
    }
}
