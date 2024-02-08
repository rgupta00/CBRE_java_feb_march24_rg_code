package com.day5.ex0.object_class_java;

//if a interface is empty it is called marker interface

import java.util.Objects;
import java.util.StringJoiner;

//step 2: ensure that ur class imple... clonnable interface

//about finilized method
//c++ manual memory mgt
//java : GC, only be req from the programmer , but gc can ignore ur call

//what is the need of need of marker interface Cloneable
//list 5 marker interface in java

//cloning
public class Employee implements Cloneable{
	private int id;
	private String name;
	private String city;
	private double salary;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("it is finalize method ");
		super.finalize();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//	//copy ctr manual process
//	public Employee(Employee e) {
//		this.id = e.id;
//		this.name = e.name;
//		this.city = e.city;
//		this.salary = e.salary;
//	}

	public Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(city, employee.city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, city, salary);
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
