package com.day5.ex8.b.generic_class;

public class Stack {

	private int arr[];
	private int top;
	private final int SIZE=5;
	
	public Stack() {
		arr=new int[SIZE];
		top =-1;
	}
	
	public void push(int data) {
		if(top==SIZE-1) {
			System.out.println("overflow....");
		}else {
			arr[++top]=data;
		}
	}
	public int pop() {
		if(top==-1) {
			return -999;
		}else {
			return arr[top--];
		}
	}

	
	public int peek() {
		return 0;
	}
}
