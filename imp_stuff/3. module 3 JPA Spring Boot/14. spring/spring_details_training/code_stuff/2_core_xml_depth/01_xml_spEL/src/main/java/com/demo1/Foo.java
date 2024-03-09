package com.demo1;

public class Foo {
	private Double randomNumber;
	private Double pi;
	
	public void setRandomNumber(Double randomNumber) {
		this.randomNumber = randomNumber;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}
	
	public void print() {
		System.out.println("value of randomNo: "+ randomNumber);
		System.out.println("value of pi: "+ pi);
	}
	
}
