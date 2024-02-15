package com.dp.creational.c.builder2;

public class Demo {

	public static void main(String[] args) {
		Vehicle c=new Vehicle.VehicleBuilder("",4).setAirbags(4).build();
//		Vehicle vehicle=new Vehicle();

	}
}
