package com.empapp.entities;

import java.util.ArrayList;
import java.util.List;
public class Department {
	private int deptId;
	
	private String deptName;

	private List<Employee> employees = new ArrayList<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {}

	public Department(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}