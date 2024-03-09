package com.productapp.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "products")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	//http://localhost:8080/productspage?offSet=1&pageSize=20
	@GetMapping(path = "productspage")
	public Page<Product> findProductsWithPagination(@RequestParam(name ="offSet" ) int offSet,
			@RequestParam(name ="pageSize" ) int pageSize){
		return productService.findProductsWithPagination(offSet, pageSize);
	}
	
	//http://localhost:8080/productspagewithsorting?offSet=0&pageSize=20&field=quantity
	@GetMapping(path = "productspagewithsorting")
	public Page<Product> findProductsWithPaginationAndSorting(@RequestParam(name ="offSet" ) int offSet,
			@RequestParam(name ="pageSize")int pageSize ,@RequestParam(name ="field") 
			String field){
		return productService.findProductsWithPaginationAndSorting(offSet, pageSize, field);
	}
	
}
