package com.dp.creational.c.builder2;

public class Vehicle {
	//mandatory
	private String engine;
	private int wheel;
	//optional
	private int airbags;


	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirbags() {
		return airbags;
	}

	private Vehicle(VehicleBuilder vehicleBuilder){
		this.airbags=vehicleBuilder.airbags;
		this.wheel=vehicleBuilder.wheel;
		this.engine=vehicleBuilder.engine;
	}
	public static class VehicleBuilder{
		private String engine;
		private int wheel;
		//optional
		private int airbags;

		public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		public Vehicle build(){
			return new Vehicle(this);
		}
	}
}
