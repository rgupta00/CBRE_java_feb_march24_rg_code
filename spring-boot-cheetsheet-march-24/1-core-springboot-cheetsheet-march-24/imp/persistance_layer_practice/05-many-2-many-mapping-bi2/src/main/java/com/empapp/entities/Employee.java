package com.empapp.entities;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	
	private int empId;
	private String empName;

	
	private List<Project> projects = new ArrayList<Project>();

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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public Employee() {}
	

}




