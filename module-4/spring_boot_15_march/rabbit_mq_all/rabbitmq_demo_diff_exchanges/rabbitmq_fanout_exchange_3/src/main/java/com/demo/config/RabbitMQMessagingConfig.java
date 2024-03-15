package com.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQMessagingConfig {
    //------------create 4 Queues-----------
    @Bean
    public Queue mktQueue(){
        return new Queue("mktQueue", false);
    }

    @Bean
    public Queue finQueue(){
        return new Queue("finQueue", false);
    }

    @Bean
    public Queue adminQueue(){
        return new Queue("adminQueue", false);
    }

    @Bean
    public Queue allQueue(){
        return new Queue("allQueue", false);
    }

    //------------create and direct exchange Queues-----------
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout-exchange");
    }

    //------------create 3 Binding-----------
    @Bean
    public Binding mktQueueBinding(Queue mktQueue, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(mktQueue).to(fanoutExchange);
    }

    @Bean
    public Binding finQueueBinding(Queue finQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(finQueue).to(fanoutExchange);
    }


    @Bean
    public Binding adminQueueBinding(Queue adminQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(adminQueue).to(fanoutExchange);
    }

    @Bean
    public Binding allQueueBinding(Queue allQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(allQueue).to(fanoutExchange);
    }
}

