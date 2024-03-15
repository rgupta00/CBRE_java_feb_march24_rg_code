package com.orderapp.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {

    public static final String QUEUE = "order_queue";
    public static final String DL_QUEUE = "dl_queue";

    public static final String EXCHANGE = "order_exchange";
    public static final String DL_EXCHANGE = "dl_exchange";

    public static final String ROUTING_KEY = "order_routingKey";
    public static final String DL_ROUTING_KEY = "deadLetter_routingKey";

    //-----create both exchange-------------
    @Bean
    TopicExchange deadLetterExchange() {
        return new TopicExchange(DL_EXCHANGE);
    }

    @Bean
    public TopicExchange orderExchange() {
        return new TopicExchange(EXCHANGE);
    }

    //-----create both queues-------------
    @Bean
    Queue orderQueue() {
        return QueueBuilder.durable(QUEUE)
                .withArgument("x-dead-letter-exchange", DL_EXCHANGE)
                .withArgument("x-dead-letter-routing-key", DL_ROUTING_KEY)
                .build();
    }
    @Bean
    Queue dlQueue() {
        return QueueBuilder.durable(DL_QUEUE).build();
    }

    //-------binding both  queues
    @Bean
    public Binding order_binding(Queue orderQueue, TopicExchange orderExchange) {
        return BindingBuilder.bind(orderQueue).to(orderExchange).with(ROUTING_KEY);
    }

    @Bean
    Binding DLQbinding(Queue dlQueue, TopicExchange  deadLetterExchange) {
        return BindingBuilder.bind(dlQueue).to(deadLetterExchange).with(DL_ROUTING_KEY);
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}

