package com.empapp.moreann;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

enum EmployeeType{
    F,P;
}
//let we help hib to create table and map to class
@Entity
@Table(name = "employee_table_more_anno")
@Data
@NoArgsConstructor
public class Employee {
    @Id //we must have
    @GeneratedValue(strategy = GenerationType.IDENTITY) //*
    private int id;
    @Column(name = "emp_name", length = 100, nullable = false)
    private String name;

    @Column(name = "emp_salary", nullable = false)
    private double salary;

    @Column(name = "emp_dept", length = 100, nullable = false)
    private String dept;

    @Transient  //hey hib dont store it into database
    private String tempPassword;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Temporal(TemporalType.TIMESTAMP)
    private Date longTime;

    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


}
