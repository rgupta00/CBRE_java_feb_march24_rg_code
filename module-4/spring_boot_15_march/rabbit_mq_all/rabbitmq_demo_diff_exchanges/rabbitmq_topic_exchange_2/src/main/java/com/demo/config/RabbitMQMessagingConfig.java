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
    public TopicExchange topicExchange(){
        return new TopicExchange("topic-exchange");
    }

    //------------create 3 Binding-----------
    @Bean
    public Binding mktQueueBinding(Queue mktQueue, TopicExchange topicExchange){
        return BindingBuilder.bind(mktQueue).to(topicExchange).with("queue.mkt");
    }

    @Bean
    public Binding finQueueBinding(Queue finQueue, TopicExchange topicExchange){
        return BindingBuilder.bind(finQueue).to(topicExchange).with("queue.fin");
    }


    @Bean
    public Binding adminQueueBinding(Queue adminQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(adminQueue).to(topicExchange).with("queue.admin");
    }

    @Bean
    public Binding allQueueBinding(Queue allQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(allQueue).to(topicExchange).with("queue.*");
    }
}

