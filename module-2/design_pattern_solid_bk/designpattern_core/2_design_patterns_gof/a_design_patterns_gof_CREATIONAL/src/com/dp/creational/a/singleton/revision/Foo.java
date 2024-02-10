package com.dp.creational.a.singleton.revision;
class Bar{
	void foof() {
		System.out.println("foof ...");
	}
}
public class Foo extends Bar{
	@Override
	void foof() {
		System.out.println("foof ...");
	}
}
