package com.demo.sol;

//Rectangle "reuse" Square : Inheritance XXX
class Rectangle {
	
	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}
}

//favour composition over inheritance
class Square  {
	private Rectangle rectangle;
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public int calculateArea() {
		//i am using the logic from rectangle
		return rectangle.calculateArea();
	}
	public void changeDimeansion(int changeDimesion) {
		rectangle.setL(changeDimesion);
		rectangle.setB(changeDimesion);
	}
	
}

public class DemoLiskov {

	public static void main(String[] args) {
		/*
		 * 
		 * favour composition over inheritance square rectangle liskov java
		 * 
		 */
		Square square=new Square(3);
		int area=square.calculateArea();
		
		System.out.println(area);
		
		square.changeDimeansion(4);
		
		 area=square.calculateArea();
		System.out.println(area);
	}
}
