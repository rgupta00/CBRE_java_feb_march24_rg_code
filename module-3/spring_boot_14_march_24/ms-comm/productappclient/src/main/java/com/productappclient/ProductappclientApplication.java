package com.productappclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//u need to integrate spring boot + openfeign
@EnableFeignClients("com.productappclient.services")
@SpringBootApplication
public class ProductappclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappclientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
