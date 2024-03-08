package com.employeeapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp_table_2")
@ToString(exclude = {"department"})
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private double salary;

	@JsonBackReference	//N side
	@ManyToOne(fetch = FetchType.EAGER)
	private Department department;

	public Employee(String name, double salary, Department department) {
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
}