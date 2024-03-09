package com.demo;

public class BookDto {
	
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookDto(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public BookDto() {}
	@Override
	public String toString() {
		return "BookDto [title=" + title + ", price=" + price + "]";
	}
	
	
	
}
