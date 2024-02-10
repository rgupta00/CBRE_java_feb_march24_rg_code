package com.demo;

public class Car {

	private Engine engine;
	private Tyre tyre;

//	public Car() {
//		engine=EngineFactory.getEngine();
//		tyre=TyreFactory.getTyre();
//	}

	public void drive() {
		engine.move();
		tyre.rotate();
	}

	public Car(Engine engine, Tyre tyre) {
		this.engine = engine;
		this.tyre = tyre;
	}
}
