package com.demo;

import java.util.*;

public class ProductStore {
	private String productStoreName;
	private List<Product> products;

	private Product firstProduct;

	public void setFirstProduct(Product firstProduct) {
		this.firstProduct = firstProduct;
	}

	public void setProductStoreName(String productStoreName) {
		this.productStoreName = productStoreName;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void printDetails() {
		System.out.println("productStoreName: " + productStoreName);
		System.out.println("--------products in store -------------");
		products.forEach(p -> System.out.println(p));
		System.out.println("--------firstProduct of the store-------");
		System.out.println(firstProduct);

	}
}
