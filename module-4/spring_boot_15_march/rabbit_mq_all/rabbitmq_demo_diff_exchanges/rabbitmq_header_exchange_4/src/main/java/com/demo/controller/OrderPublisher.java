package com.demo.controller;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("header")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //http://localhost:8080/header/producer?dept=mkt&message=message1 for mkt
    @GetMapping(path ="producer" )
    public String proudcer(@RequestParam("dept") String dept,@RequestParam("message") String messageData){
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("department", dept);

        MessageConverter messageConverter = new SimpleMessageConverter();
        Message message = messageConverter.toMessage(messageData, messageProperties);
         rabbitTemplate.convertAndSend("header-exchange","", message);
         return "message is send to rabbitmQ based on header send successfully";
    }
}
