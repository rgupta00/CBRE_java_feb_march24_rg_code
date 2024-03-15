package com.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQMessagingConfig {
    //------------create 3 Queues-----------
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

    //------------create and direct exchange Queues-----------
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("direct-exchange");
    }

    //------------create 3 Binding-----------
    @Bean
    public Binding mktQueueBinding(Queue mktQueue, DirectExchange directExchange){
        return BindingBuilder.bind(mktQueue).to(directExchange).with("mkt");
    }

    @Bean
    public Binding finQueueBinding(Queue finQueue, DirectExchange directExchange){
        return BindingBuilder.bind(finQueue).to(directExchange).with("fin");
    }


    @Bean
    public Binding adminQueueBinding(Queue adminQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(adminQueue).to(directExchange).with("admin");
    }
}
