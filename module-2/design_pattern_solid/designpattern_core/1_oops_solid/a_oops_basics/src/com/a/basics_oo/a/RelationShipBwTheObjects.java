package com.a.basics_oo.a;
//A passanger is moving from LN to Noida "using" metro


//loose coupling and high cohesion

class Car{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using car");
	}
}

class Bike{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using bike");
	}
}

class Metro{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using metro");
	}
}

class Passanger{
	private String name;
	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Metro m) {
		System.out.println("name: "+ name);
		m.move(s, d);
	}
}
public class RelationShipBwTheObjects {
	
	public static void main(String[] args) {
		//foolish code: if u have one change in the req... ur code have to change at many places :(
		//Bike bike=new Bike();
		Metro m=new Metro();
		Passanger passanger=new Passanger("raj");
		passanger.travel("Preet Vihar", "CP", m);
	}

}



