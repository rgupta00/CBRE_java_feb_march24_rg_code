package com.demo.junk;

import com.demo.MrfTyre;
import com.demo.V8Engine;

public class Car {
	
	private V8Engine engine=new V8Engine();
	private MrfTyre tyre=new MrfTyre();
	
	public Car() {
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
