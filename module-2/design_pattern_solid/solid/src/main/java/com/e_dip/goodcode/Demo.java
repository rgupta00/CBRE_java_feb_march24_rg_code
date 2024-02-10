package com.e_dip.goodcode;

public class Demo {

	public static void main(String[] args) {
		//Manual DI
		Engine engine=new TurboEngine();
		Tyre tyre=new CeatTyre();

		Car car =new Car(engine, tyre);
		car.drive();
	}
}
