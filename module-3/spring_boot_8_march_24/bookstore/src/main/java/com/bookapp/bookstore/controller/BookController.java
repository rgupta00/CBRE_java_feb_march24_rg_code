package com.bookapp.bookstore.controller;

import com.bookapp.bookstore.entities.Book;
import com.bookapp.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Controller
//@ResponseBody
//@RestController=@Controller + @ResponseBody
@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //get all the books
    @GetMapping(path = "books")
    public List<Book> getAll(){
        return bookService.getAll();
    }
    //get book by id

    //@RequestBody: it trigger parser (jackson) to convert json to java object
    //add book


    //Patch vs Update
    //if u need to only update a portion of data if u want update any part of the data update
    //update book

    //delete book


}
