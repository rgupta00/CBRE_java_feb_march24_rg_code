package com.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("direct")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate  rabbitTemplate;

    //http://localhost:8080/direct/producer?routingkey=mkt&message=message1 for mkt
    @GetMapping(path ="producer" )
    public String proudcer(@RequestParam("routingkey") String routingkey,@RequestParam("message") String message){
         rabbitTemplate.convertAndSend("direct-exchange",routingkey, message);
         return "message is send to rabbitmQ successfully";
    }
}
