package com.day5.ex0.tricky_java_questions;

//if a interface is empty it is called marker interface

import java.util.StringJoiner;

//step 2: ensure that ur class imple... clonnable interface

//about finilized method
//c++ manual memory mgt
//java : GC, only be req from the programmer , but gc can ignore ur call

public class Employee {
	private int id;
	private String name;
	private String city;
	private double salary;

	public Employee(){
		System.out.println("it is called");
	}
	static Employee employee=new Employee();

	public Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("name='" + name + "'")
				.add("city='" + city + "'")
				.add("salary=" + salary)
				.toString();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//what is use ? we are say to gc hey gc when u clam this object
	//just before that can u call my this finilized method

}
