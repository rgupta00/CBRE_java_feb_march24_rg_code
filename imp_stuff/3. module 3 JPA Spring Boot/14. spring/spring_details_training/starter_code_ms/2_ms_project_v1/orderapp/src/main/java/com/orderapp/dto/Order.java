package com.orderapp.dto;

import java.time.LocalDate;

public class Order {
	private String id;
	private double totalAmount;
	private LocalDate orderDate;
	private Customer customer;
	private Product product;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order(String id, double totalAmount, LocalDate orderDate, Customer customer, Product product) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
		this.customer = customer;
		this.product = product;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
