package com.productapp.dao;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean isAvailable;
	
	public Product(String name, BigDecimal price, boolean isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	
	
}
