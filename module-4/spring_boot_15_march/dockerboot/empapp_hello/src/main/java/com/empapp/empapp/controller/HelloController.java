package com.empapp.empapp.controller;

import com.empapp.empapp.service.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private InstanceInformationService instanceInformationService;


    @GetMapping(path = "health")
    public String health(){
        return "good in health";
    }

    @GetMapping(path = "/")
    public String home(){
        return "app is working";
    }

    @GetMapping(path="hello-world")
    public String hello(){
        return "hello empapp v1  :"+instanceInformationService.retrieveInstanceInfo();
    }
}
