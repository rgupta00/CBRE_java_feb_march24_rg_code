package com.day5.ex1.basics_collections;

import java.util.Comparator;

//Comparable vs Compartor

/*
 * Comparable is used for natural sort ? default sort
 * Compartor is used to get extra sort seq
 */

//Sorting employee list as per name

class NameSorterThenSalarySorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int value= o1.getName().compareTo(o2.getName());
		if(value==0){
			value=Double.compare(o2.getSalary(), o1.getSalary());
		}
		return value;
	}
}

//Comparable and comparator
//Natural sort Comparable
//and extra sort seq ke liye comparator

public class Employee implements Comparable<Employee>{
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
		return "Employee [id=" + id + ", name=" + name + ", city=" + city
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	//java will call keraga
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(id, o.id);
	}
}
