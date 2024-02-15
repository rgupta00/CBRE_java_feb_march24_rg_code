package com.dp.creational.c.builder.sol;

public class Food {
	private String name;
	private int unit;
	private int vitC;
	private int vitA;
	private int vitB12;
	private int vitB5;
	private int vitD;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getVitC() {
		return vitC;
	}
	public void setVitC(int vitC) {
		this.vitC = vitC;
	}
	public int getVitA() {
		return vitA;
	}
	public void setVitA(int vitA) {
		this.vitA = vitA;
	}
	public int getVitB12() {
		return vitB12;
	}
	public void setVitB12(int vitB12) {
		this.vitB12 = vitB12;
	}
	public int getVitB5() {
		return vitB5;
	}
	public void setVitB5(int vitB5) {
		this.vitB5 = vitB5;
	}
	public int getVitD() {
		return vitD;
	}
	public void setVitD(int vitD) {
		this.vitD = vitD;
	}

	public Food(String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD) {
		super();
		this.name = name;
		this.unit = unit;
		this.vitC = vitC;
		this.vitA = vitA;
		this.vitB12 = vitB12;
		this.vitB5 = vitB5;
		this.vitD = vitD;
	}

//	public Food(String name, int unit, int vitD) {
//		super();
//		this.name = name;
//		this.unit = unit;
//		this.vitD = vitD;
//	}


	public Food(String name, int unit) {
		super();
		this.name = name;
		this.unit = unit;
		this.vitC = vitC;
	}
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food [name=").append(name).append(", unit=").append(unit).append(", vitC=").append(vitC)
				.append(", vitA=").append(vitA).append(", vitB12=").append(vitB12).append(", vitB5=").append(vitB5)
				.append(", vitD=").append(vitD).append("]");
		return builder.toString();
	}

	
	
}