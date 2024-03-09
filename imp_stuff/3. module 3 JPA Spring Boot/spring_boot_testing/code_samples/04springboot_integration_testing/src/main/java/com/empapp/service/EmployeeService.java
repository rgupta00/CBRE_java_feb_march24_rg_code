package com.empapp.service;

import java.util.List;
import java.util.Optional;

import com.empapp.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee updatedEmployee);
    void deleteEmployee(long id);
    public void deleteAll();
	void saveAll(List<Employee> listOfEmployees);
	
    
}
