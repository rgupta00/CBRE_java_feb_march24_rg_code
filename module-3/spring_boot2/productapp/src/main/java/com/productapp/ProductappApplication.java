package com.productapp;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
@OpenAPIDefinition(info = @Info(title = "product API", version = "2.0" , description = "CBRE productstore API"))
@SpringBootApplication
public class ProductappApplication  {
	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}
}
