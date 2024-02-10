package com.dp.structural.b.decorator;

public class Demo {

	public static void main(String[] args) {
		Car car =new SuperSportCar(new SportCar(new BasicCar()));
		System.out.println(car.assemble());
	}
}
