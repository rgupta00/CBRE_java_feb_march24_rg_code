package com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

	@Autowired
	private ProduceService produceService;

	@PostMapping("producer")
	public String callProducer(@RequestBody Product product) {
		produceService.produce(product);
		return "product added";
	}
}