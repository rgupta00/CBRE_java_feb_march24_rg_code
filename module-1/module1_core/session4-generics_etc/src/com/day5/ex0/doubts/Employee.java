package com.day5.ex0.doubts;

import java.util.Comparator;

//Comparable vs Compartor
class SalarySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(),o2.getSalary());
	}
}
class CitySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}


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

	@Override
	public int compareTo(Employee o) {
	//	Integer temp1=this.getId();
//		return temp1.compareTo(o.getId());
	//	return Integer.compare(this.id, o.getId());//*
		return this.getName().compareTo(o.getName());
	}
}
