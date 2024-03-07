package com.productapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProfileController {

    @Value(("${info.key}"))
    private String key;

    @GetMapping(path = "key")
    public String hello(){
        return key;
    }

}
