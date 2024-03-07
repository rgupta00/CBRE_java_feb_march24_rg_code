package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "hello")
    public String hello(){
        return "hello to spring mvc on tomcat";
    }
}
