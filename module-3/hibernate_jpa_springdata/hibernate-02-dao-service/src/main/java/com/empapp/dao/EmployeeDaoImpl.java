package com.empapp.dao;

import com.empapp.entities.Employee;
import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.util.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private SessionFactory sessionFactory;

    public EmployeeDaoImpl(){
        this.sessionFactory= SessionFactoryUtil.getSessionFactory();
    }
    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return  null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return null;
    }

    @Override
    public Employee deleteById(int id) {
        return null;
    }
}
