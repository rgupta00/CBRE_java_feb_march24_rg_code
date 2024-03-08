package com.employeeapp.dto;

import com.employeeapp.entities.Department;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity

public class EmployeeDto {
	private int eid;
	private String name;
	private double salary;

	@JsonBackReference	//N side

	private Department department;

	public EmployeeDto(String name, double salary, Department department) {
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
}