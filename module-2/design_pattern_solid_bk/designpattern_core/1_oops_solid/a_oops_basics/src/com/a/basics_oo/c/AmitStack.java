package com.a.basics_oo.c;

public class AmitStack{
	private int arr[];
	private int SIZE;
	private int top;
	public AmitStack() {
		SIZE=5;
		arr=new int[5];
		top=-1;
	}
	
	public void amitPush(int data) {
		//let assume he is using LL(Link list)
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int raviPop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		return arr[top--];
	}
}
