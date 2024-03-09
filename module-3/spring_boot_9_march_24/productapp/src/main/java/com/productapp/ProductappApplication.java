package com.productapp;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
@EnableScheduling
@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

//	@Autowired
//	private ProductService productService;

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product>products= IntStream.rangeClosed(1, 2000)
				.mapToObj(i-> new Product("product "+i, new Random().nextDouble(5000)))
				.toList();

		productRepo.saveAll(products);//batch

//		productService.addProduct(new Product("laptop", 120000.00));
//		productService.addProduct(new Product("laptop coolpad", 1250.00));
//		dbInit();

//		Product product=productRepo.findByName("laptop").orElseThrow(()->new ProductNotFoundException("not found"));
//		System.out.println(product);
//
//		Product product=productRepo.findByNameAndPrice("laptop",220000.00).orElseThrow(()->new ProductNotFoundException("not found"));
//		System.out.println(product);

//		List<Product> laptops = productRepo.getListOfAllProductsBasedOnNameV2("laptop");
//		laptops.forEach(l-> System.out.println(l));

	}

	private void dbInit() {
		productRepo.save(new Product("laptop", 120000.00));
		productRepo.save(new Product("laptop stand", 820.00));
	}
}
