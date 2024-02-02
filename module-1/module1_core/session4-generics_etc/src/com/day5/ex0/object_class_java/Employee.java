package com.day5.ex0.object_class_java;

//if a interface is empty it is called marker interface

import java.util.Objects;

//step 2: ensure that ur class imple... clonnable interface

//about finilized method
//c++ manual memory mgt
//java : GC, only be req from the programmer , but gc can ignore ur call

public class Employee extends Object implements Cloneable{
	private int id;
	private String name;
	private String city;
	private double salary;

	//what is use ? we are say to gc hey gc when u clam this object
	//just before that can u call my this finilized method

	@Override
	protected void finalize() throws Throwable {
		//to clean the resource...
		System.out.println("is is finlized method call");
		super.finalize();
	}

	public Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Employee{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", city='").append(city).append('\'');
		sb.append(", salary=").append(salary);
		sb.append('}');
		return sb.toString();
	}

	public Employee() {}

	//if u have defined a class it is ur respo to override this method
	//contract bw eq and hashcode*
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		Employee employee = (Employee) o;
//		return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(city, employee.city);
//	}
//
//	//Why i should do that *
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, city, salary);
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	//Shallow copy vs deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
