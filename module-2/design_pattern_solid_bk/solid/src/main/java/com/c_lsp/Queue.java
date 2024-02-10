package com.c_lsp;

import java.util.LinkedList;
//FIFO
public class Queue {
	private  LinkedList<String> list;
	public Queue() {
		list=new LinkedList();
	}
	
	//use LinkedList to create the behaviour for Queue
	public void addFirst(String data) {
		list.addFirst(data);
	}
}
