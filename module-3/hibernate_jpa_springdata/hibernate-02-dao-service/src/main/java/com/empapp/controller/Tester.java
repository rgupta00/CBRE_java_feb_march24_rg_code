package com.empapp.controller;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();

        Employee e=new Employee("amit",6700, "Mkt");
//        employeeService.addEmployee(e);
//
//        List<Employee> employees=employeeService.getAll();
//        employees.forEach(emp-> System.out.println(emp));

    }
}
