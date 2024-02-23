package com.empapp.service;

import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImpl;
import com.empapp.entities.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(){
        employeeDao=new EmployeeDaoImpl();
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return employeeDao.updateEmployee(id, employee);
    }

    @Override
    public Employee deleteById(int id) {
        return employeeDao.deleteById(id);
    }
}
