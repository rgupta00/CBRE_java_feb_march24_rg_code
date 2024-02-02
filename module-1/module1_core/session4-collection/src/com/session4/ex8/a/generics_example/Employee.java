package com.session4.ex8.a.generics_example;

import java.util.Comparator;
class EmployeeSortingAsPerCity implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class EmployeeSortingAsPerName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int val= o1.getName().compareTo(o2.getName());
		if(val==0) {
			val= Double.compare(o2.getSalary(), o1.getSalary());
		}
		return val;
	}
}
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String city;
	private double salary;
	
	public Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public Employee() {}


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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", city=").append(city)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
}
