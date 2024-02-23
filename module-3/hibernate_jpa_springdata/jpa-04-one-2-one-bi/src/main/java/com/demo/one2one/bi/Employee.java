package com.demo.one2one.bi;

import jakarta.persistence.*;
//owner
@Entity
@Table(name = "e_table")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	@OneToOne(mappedBy = "employee")
	private Parking parking;

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Employee() {}
	
	public Employee(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
