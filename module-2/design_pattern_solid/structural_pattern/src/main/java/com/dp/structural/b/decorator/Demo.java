package com.dp.structural.b.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
	good morning
	special good morning
	very special good morning
 */
interface Greet{
	public String greet();

}
class SimpleGreet implements Greet{
	@Override
	public String greet() {
		return "good morning";
	}
}
class SpecialGoodMorning implements Greet{

	private Greet greet;

	public SpecialGoodMorning(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "special "+ greet.greet();
	}
}
class VerySpecialGoodMorning implements Greet{

	private Greet greet;
	public VerySpecialGoodMorning(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "very "+ greet.greet();
	}
}
public class Demo {

	public static void main(String[] args)throws Exception {

//		Greet greet=new VerySpecialGoodMorning(new SpecialGoodMorning(new SimpleGreet()));
//		System.out.println(greet.greet());

		Greet greet=new SpecialGoodMorning(new SimpleGreet());
		System.out.println(greet.greet());

		//Decorator io
//		BufferedReader br=new BufferedReader(new FileReader(new File("foo.txt")));
//
//		Car car =new SuperSportCar(new SportCar(new BasicCar()));
//		System.out.println(car.assemble());
	}
}
