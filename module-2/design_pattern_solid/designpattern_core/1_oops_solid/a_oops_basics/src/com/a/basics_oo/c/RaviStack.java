package com.a.basics_oo.c;

public class RaviStack{
	private int arr[];
	private int SIZE;
	private int top;
	public RaviStack() {
		SIZE=5;
		arr=new int[5];
		top=-1;
	}
	
	public void pushData(int data) {
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int popData() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		return arr[top--];
	}
}
