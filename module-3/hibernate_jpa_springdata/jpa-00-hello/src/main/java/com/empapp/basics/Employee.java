package com.empapp.basics;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//let we help hib to create table and map to class
@Entity
@Table(name = "employee_table_jpa")
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


    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


}
