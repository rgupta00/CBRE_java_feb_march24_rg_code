package com.dp.behavioural.b.observer_dp;

public class Main {

	public static void main(String[] args) {
		MySubject subject=new MySubject("rice", 55);
		MyObserver o=new MyObserver();
		
		subject.addObserver(o);
		
		subject.setPrice(88);
		subject.setPrice(99);
	}
}
