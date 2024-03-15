package com.producer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	@KafkaListener(topics = "my_topic", groupId = "my_topic_group_id")
	public void consume(Product product) {
		System.out.println(product);
	}
}