package com.productapp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		productService.addProduct(new Product("laptop", new BigDecimal(77800)));
//		productService.addProduct(new Product("tv", new BigDecimal(97800)));
		System.out.println("------added------");

	}

}
