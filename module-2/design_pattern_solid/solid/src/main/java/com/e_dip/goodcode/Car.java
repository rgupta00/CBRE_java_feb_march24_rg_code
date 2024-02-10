package com.e_dip.goodcode;
//pull
public class Car {
	private Engine engine;
	private Tyre tyre;

	public Car(Engine engine, Tyre tyre) {
		this.engine = engine;
		this.tyre = tyre;
	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
