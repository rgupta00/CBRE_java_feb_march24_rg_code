package com.dp.structural.b.decorator;

interface Car {
	public String assemble();
}

class BasicCar implements Car {

	@Override
	public String assemble() {
		return "basic car";
	}

}

abstract class CarDecorator implements Car {
	private Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public String assemble() {
		return car.assemble();
	}
}

class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
	}

	@Override
	public String assemble() {
		return super.assemble() + " with sport feature";
	}
}

class SuperSportCar extends CarDecorator {

	public SuperSportCar(Car car) {
		super(car);
	}

	@Override
	public String assemble() {
		return super.assemble() + " with extra super sport feature";
	}
}
