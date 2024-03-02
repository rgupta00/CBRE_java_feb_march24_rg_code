package com.bookapp.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //http://localhost:8080/hello2?uname=raj
    @GetMapping(path = "hello2")
    public String sayHello2(@RequestParam(name = "uname") String name){
        return "hello to spring rest "+name;
    }

    //http://localhost:8080/hello/raj
    @GetMapping(path = "hello/{uname}")
    public String sayHello(@PathVariable(name = "uname") String name){
        return "hello to spring rest "+name;
    }
}
