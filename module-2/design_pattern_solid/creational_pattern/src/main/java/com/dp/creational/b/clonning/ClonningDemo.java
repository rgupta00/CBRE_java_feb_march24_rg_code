package com.dp.creational.b.clonning;

import java.util.Date;
import java.util.GregorianCalendar;

public class ClonningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new GregorianCalendar(2001, 11, 22).getTime();
		
		Employee employee1 = new Employee(33, "raja", date);
		System.out.println(employee1);
	
//		Employee employee2 = (Employee) employee1.clone();
//		System.out.println(employee2);
//
//		employee2.getHireDay().setDate(12);
//
//		System.out.println(employee1);
//		System.out.println(employee2);
//		
//		System.out.println("After changing............");
//		employee1.changeHireDay(2011, 11, 11);
//		employee1.setName("amit");
//		System.out.println(employee1);
//		System.out.println(employee2);

	}

}