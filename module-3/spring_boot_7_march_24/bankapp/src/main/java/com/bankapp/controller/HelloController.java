package com.bankapp.controller;

import org.springframework.web.bind.annotation.*;

//REST
@RestController
@RequestMapping(path = "helloapi")
public class HelloController {

    //PathVariable and RequestParam(pagination)

    @GetMapping(path = "bye")
    public String sayBye(@RequestParam(name = "uname", required = false, defaultValue = "raj") String name,
                         @RequestParam(name = "city", required = false, defaultValue = "NCR") String city){
        return "hello to all cbre champs! using RequestParam "+ name +" "+ city;
    }

    @GetMapping(path = "hello/{uname}/{city}")
    public String sayHello(@PathVariable(name = "uname") String name, @PathVariable(name = "city") String city){
        return "hello to all cbre champs! using pathv... "+ name +" "+ city;
    }
}
