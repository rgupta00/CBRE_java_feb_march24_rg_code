package com.dp.creational.b.clonning;

import java.util.Date;

class Employee  implements Cloneable{
	private Integer id;
	private String name;
	private Date hireDay;//mutable

	public Employee(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.hireDay=date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hireDay=" + hireDay
				+ "]";
	}

	public void changeHireDay(int year, int month, int day){
		 hireDay.setDate(day);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	
}


//Employee clonnedObject= (Employee) super.clone();
//clonnedObject.hireDay=(Date) hireDay.clone();
//		return clonnedObject;






