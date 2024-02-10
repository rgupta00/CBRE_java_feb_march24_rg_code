package com.a.basics_oo.e;

//joy-->jump Monkey
interface Jumpable{
   public void jump();
}
class Monkey implements Jumpable{
	public void stayAtTree() {
		System.out.println("stayAtTree");
	}
	///
	@Override
	public void jump() {
		System.out.println("jump of a monkey");
	}
}

class Kid implements Jumpable{
	public void goToSchool() {
		System.out.println("go to school");
	}
	public void goToLib() {
		System.out.println("go to school");
	}
	///
	@Override
	public void jump() {
		System.out.println("i can also jump");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		///Monkey k=new Kid();//this kid not monkey but he have some behaviour that is common amount them
		
	}
}
