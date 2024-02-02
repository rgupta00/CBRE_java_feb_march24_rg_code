package com.day5.ex4.map_example;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class MyKey{
	private int k;

	public int getK() {
		return k;
	}

	public MyKey(int k) {
		super();
		this.k = k;
	}

	@Override
	public String toString() {
		return "MyKey [k=" + k + "]";
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		if (k != other.k)
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method is called...");
	}
	
	
}
public class F_WeakHashMap {
	
	public static void main(String[] args) throws InterruptedException {

		
		
		
	}

}
