package com.demo;

import java.util.List;

public class ProductCollection {

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getFirstProduct() {
		return products.get(0);
	}
	
	
}
