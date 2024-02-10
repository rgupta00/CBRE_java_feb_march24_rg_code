package com.dp.creational.a.singleton.revision;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
//java 1.4
final public class Singleton implements Cloneable, Serializable {

	private volatile static Singleton singleton=null;
	
	//Java reflaction can bypass encapsulation
	
	 private Singleton() {
		if(singleton!=null)
			throw new IllegalStateException();
	}
	
	 
	public  static Singleton getSingleton() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}
	
	//JVM
	private Object readResolve() {
		//System.out.println("jvm is calling it during de-ser");
		return singleton;
	}
	
}
















