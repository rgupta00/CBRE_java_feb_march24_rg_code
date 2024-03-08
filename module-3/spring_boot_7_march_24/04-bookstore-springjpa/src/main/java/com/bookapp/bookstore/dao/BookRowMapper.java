package com.bookapp.bookstore.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
//this will teach jdbcTemplete how to convert rs to object
public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("it is called");
        Book book=new Book(
                rs.getInt("id"),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getDouble(5));
        return book;
    }
}
