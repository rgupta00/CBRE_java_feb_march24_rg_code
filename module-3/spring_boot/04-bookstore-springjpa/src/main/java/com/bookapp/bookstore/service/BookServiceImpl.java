package com.bookapp.bookstore.service;

import com.bookapp.bookstore.dao.Book;
import com.bookapp.bookstore.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional //it will help to achive declartive tx mgt ,It use AOP under the hood , around advice
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookDao.getBookById(bookId);
    }

    @Override
    public Book addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public Book updateBook(Long bookId, Book book) {
        return bookDao.updateBook(bookId, book);
    }

    @Override
    public Book removeBook(Long bookId) {
        return bookDao.removeBook(bookId);
    }


}
