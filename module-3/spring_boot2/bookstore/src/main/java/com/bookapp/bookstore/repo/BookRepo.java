package com.bookapp.bookstore.repo;

import com.bookapp.bookstore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    //get by isbn
    public Optional<Book> findByIsbn(String isbn);
}
