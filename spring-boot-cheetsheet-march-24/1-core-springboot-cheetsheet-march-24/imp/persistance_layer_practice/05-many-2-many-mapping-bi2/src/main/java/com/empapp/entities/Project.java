package com.empapp.entities;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private int projectId;
	private String projectName;

	private List<Employee> employees = new ArrayList<Employee>();

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project() {
	}

	public Project(String projectName) {
		this.projectName = projectName;
	}

}
