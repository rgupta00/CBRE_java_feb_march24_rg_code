package com.employeeapp.dto;

import com.employeeapp.entities.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

//Apply validation on this pojo
@Data
@NoArgsConstructor
@Entity
public class DepartmentDto {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String dname;
	//@JsonManagedReference //1 side
	@JsonIgnore

	private List<Employee> employees=new ArrayList<>();

	public DepartmentDto(String dname) {
		this.dname = dname;
	}
}