package com.bookapp.bookstore.dao.impl;

import com.bookapp.bookstore.dao.Book;
import com.bookapp.bookstore.dao.BookDao;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class BookDaoImplUsingJpa implements BookDao {

    private EntityManager em;

    @Autowired
    public BookDaoImplUsingJpa(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Book> getAll() {
        return em.createQuery("select b from Book b", Book.class).getResultList();
    }

    @Override
    public Book getBookById(Long bookId) {
        return em.find(Book.class, bookId);
    }

    @Override
    public Book addBook(Book book) {
        em.persist(book);
        return book;
    }

    @Override
    public Book updateBook(Long bookId, Book book) {
        Book bookToUpdate=getBookById(bookId);
        bookToUpdate.setPrice(book.getPrice());
        em.merge(bookToUpdate);
        return bookToUpdate;
    }

    @Override
    public Book removeBook(Long bookId) {
        Book bookToDelete=getBookById(bookId);
        em.remove(bookToDelete);
        return bookToDelete;
    }
}
