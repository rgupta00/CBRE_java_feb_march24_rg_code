package com.a.basics_oo.d;
//Covarient retrun type java5

//class A {
//	void foo() {
//		System.out.println("foo of class A");
//	}
//
//	void bar() {
//		System.out.println("bar of class A");
//	}
//}
//
//class B extends A {
//	void jar() {
//		System.out.println("jar of class B");
//	}
//
//}

//covarient return type
//upcasting and downcasting
class Milk {
}

class PasteurizedMilk extends Milk {
}

class KrishnaDairy {
	public Milk sell(int qty) {
		return new Milk();
	}
}

class NewKrishnaDairy extends KrishnaDairy {
	@Override
	public Milk sell(int qty) {
		return new PasteurizedMilk();
	}
}

public class Demo {
	public static void main(String[] args) {

		// A a = new B();

//		B b= new A();
//		b.jar();

//		if (a instanceof B)
//			((B) a).jar();

	}
}
