package com.orderappclient.service;


import com.orderappclient.config.MessagingConfig;
import com.orderappclient.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("order recived :" + orderStatus.getOrder().getPrice());
        if(orderStatus.getOrder().getPrice()<200)
            throw new RuntimeException("min order is 200");
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}