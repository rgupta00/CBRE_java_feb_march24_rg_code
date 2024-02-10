package com.productapp.controller;

import com.productapp.model.dto.Product;
import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.impl.ProductServiceImpl;

public class Main {

	public static void main(String[] args)  {
		Product product=new Product("laptop mouse", 4000.0);
		ProductService productService=new ProductServiceImpl();
		try {
			productService.addProduct(product);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}
}
