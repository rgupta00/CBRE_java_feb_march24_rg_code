package com.day5.ex6.map_examples;
import java.util.*;
import java.util.Map.Entry;

class Key2 implements Comparable<Key2>{
	private int k;

	public Key2(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Key [k=" + k + "]";
	}

	public int getK() {
		return k;
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
		Key2 other = (Key2) obj;
		if (k != other.k)
			return false;
		return true;
	}

	@Override
	public int compareTo(Key2 o) {
		return Integer.compare(this.getK(), o.getK());
	}

	
}

public class DemoHashMap {

	public static void main(String[] args) {
		
		//how to deal with TreeMap with user define object
		
		Map<Key2, Employee> map=new TreeMap<Key2, Employee>();
		map.put(new Key2(12), new Employee(12, "Raj", "delhi", 567000));
		map.put(new Key2(2), new Employee(2, "Suman", "Noida", 517000));
		
		map.forEach((k, v)-> System.out.println(k+" : "+ v));
		//boolean isPresent= map.containsKey(new Key2(12));
		
		//System.out.println(isPresent);
		
		
		
		//user define key ?
		//emp name --> salary
//		Map<Key2, Employee> map=new HashMap<Key2, Employee>();
//		map.put(new Key2(12), new Employee(12, "Raj", "delhi", 567000));
//		map.put(new Key2(2), new Employee(2, "Suman", "Noida", 517000));
//		
//		boolean isPresent= map.containsKey(new Key2(12));
//		
//		System.out.println(isPresent);
		
		
		
	}
}
