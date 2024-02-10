package com.demo;

public class Demo {

	public static void main(String[] args) {
		//Manual DI
		Engine engine=new V8Engine();
		Tyre tyre=new MrfTyre();
		
		Car car =new Car(engine,tyre);
		car.drive();
	}
}
