package com.demo;

import java.math.BigDecimal;

public class Product {
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean isAvailable;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Product(Integer id, String name, BigDecimal price, boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
	public Product() {}

}
