package com.day5.ex8.b.generic_class;

import java.lang.reflect.Array;
import java.util.Comparator;

class OverFlowEx extends  RuntimeException{
	public OverFlowEx(String message) {
		super(message);
	}
}
class UnderFlowEx extends  RuntimeException{
	public UnderFlowEx(String message) {
		super(message);
	}
}
public class Stack<E extends Comparable<E>> {

	private E arr[];
	private int top;
	private final int SIZE=5;
	
	public Stack(Class<E> clazz, int initCap) {
		arr = (E[]) Array.newInstance(clazz, initCap);
		top =-1;
	}
	
	public void push(E data) {
		if(top==SIZE-1) {
			throw  new OverFlowEx("size is full");
		}else {
			arr[++top]=data;
		}
	}
	public E pop() {
		if(top==-1) {
			throw  new UnderFlowEx("stack is empty");
		}else {
			return arr[top--];
		}
	}


}
