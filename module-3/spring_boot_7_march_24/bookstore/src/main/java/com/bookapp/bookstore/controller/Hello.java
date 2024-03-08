package com.bookapp.bookstore.controller;

import com.bookapp.bookstore.entities.Book;

import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Map<Long, Book> books=new HashMap<Long, Book>();
        books.put(1L, new Book(1L, "ABC123", "head first", "katthy", 500.00));
        books.put(2L, new Book(1L, "ABU123", "thinking in java", "amit", 400.00));
      List<Book> books1=new LinkedList<>(  books.values());

      books1.forEach(b-> System.out.println(b));
    }
}
