package com.dp.behavioural.b.observer_dp;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
	private float price;

	@Override
	public void update(Observable o, Object a) {

		price = (float) a;

		System.out.println("price observed : price changed to :" + price);
	}

}
