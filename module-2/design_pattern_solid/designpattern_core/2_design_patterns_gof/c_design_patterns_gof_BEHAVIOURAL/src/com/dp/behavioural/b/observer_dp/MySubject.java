package com.dp.behavioural.b.observer_dp;

import java.util.Observable;

//observable (news paper wala)
public class MySubject extends Observable {
	private String name;
	private float price;

	public MySubject(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers(new Float(price));
	}

}