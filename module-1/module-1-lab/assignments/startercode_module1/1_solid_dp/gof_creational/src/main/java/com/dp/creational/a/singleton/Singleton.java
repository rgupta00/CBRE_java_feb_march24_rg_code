package com.dp.creational.a.singleton;

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
final public class Singleton implements Cloneable, Serializable{

	//java 1.4 bad solution
	//java 1.5 good solution
	private volatile  static Singleton singleton = null;// lazy vs eager way

	private Singleton() {
		System.out.println("ctr");
	}

	// t1 t2
	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();//atomic
				}
			}
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return singleton;
	}
	
	//call back : u just define this method ..jvm call this before de-ser
	private Object readResolve() {
		System.out.println("--------readResolve------------");
		return singleton;
	}
	
}















