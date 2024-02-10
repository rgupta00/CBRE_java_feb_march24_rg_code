package com.e_dip.badcode;

public class Car {
	
	private V8Engine engine;
	private CeatTyre tyre;
	
	public Car() {
		engine=new V8Engine();
		tyre=new CeatTyre();
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
