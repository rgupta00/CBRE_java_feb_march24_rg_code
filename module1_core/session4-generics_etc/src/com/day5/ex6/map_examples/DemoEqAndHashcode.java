package com.day5.ex6.map_examples;

public class DemoEqAndHashcode {
	
	public static void main(String[] args) {
		Employee employee1= new Employee(12, "raj", "noida", 978989.00);
		Employee employee2= new Employee(12, "raj", "noida", 978989.00);
		
		if(employee1.equals(employee2))
			System.out.println("yes");
		else
			System.out.println("no");
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		
	}

}
