package com.demo.sepreate_what_varies;

//sepreate what varies
//we want to creat a sw to maintain the birds
interface Flyable{
	public void fly() ;
}
interface Swimable{
	public void swim() ;
}

class Bird {
	public void sound() {
		System.out.println("bird sound...");
	}
}

class Eagle extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("fly like an king");
	}
	
}

class Duck extends Bird implements Swimable{

	@Override
	public void swim() {
		System.out.println("swim like anyting..");
	}
	
}
class Emu extends Bird{
	
}
public class Demo {
	public static void main(String[] args) {

//			Duck duck=new Duck();
//			duck.fly();
		
		Eagle eagle=new Eagle();
		//eagle.swim();
	}
}
