package com.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
In this type of exchange the routing queue is selected based on the criteria specified in the headers instead of the routing key.
This is similar to topic exchange type, but here we can specify complex criteria for selecting routing queues.
 */
@Configuration
public class RabbitMQMessagingConfig {

    //------------create 3 Queues-----mktQueue,finQueue and adminQueue queue------
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



    //------------create HeadersExchange----------
    @Bean
    public HeadersExchange headersExchange(){
        return new HeadersExchange("header-exchange");
    }


    //------------create 3 Binding-----------
    @Bean
    public Binding mktQueueBinding(Queue mktQueue, HeadersExchange headersExchange){
        return BindingBuilder.bind(mktQueue).to(headersExchange).where("dept").matches("mkt");
    }

    @Bean
    public Binding finQueueBinding(Queue finQueue,HeadersExchange headersExchange) {
        return BindingBuilder.bind(finQueue).to(headersExchange).where("dept").matches("fin");
    }

    @Bean
    public Binding adminQueueBinding(Queue adminQueue,HeadersExchange headersExchange) {
        return BindingBuilder.bind(adminQueue).to(headersExchange).where("dept").matches("admin");
    }

}

