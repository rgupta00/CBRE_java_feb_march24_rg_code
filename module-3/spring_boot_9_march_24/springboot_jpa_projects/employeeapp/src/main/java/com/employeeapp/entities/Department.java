package com.employeeapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Anti curruption pattern in rest
//Entity --> controller
//entity --> dto --> send to the user
//dto-> entity -> service layer

@Data
@NoArgsConstructor
@Entity
@Table(name = "dept_table_2")
@ToString(exclude = {"employees"})
public class Department {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String dname;
	//@JsonManagedReference //1 side
	//@JsonIgnore
	@OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Employee> employees=new ArrayList<>();

	public Department(String dname) {
		this.dname = dname;
	}
}