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
        Session session=sessionFactory.openSession();
        List<Employee> employees=session.createQuery("select e from Employee e", Employee.class).getResultList();
        session.close();
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Session session=sessionFactory.openSession();
        Employee employee=session.get(Employee.class, id);
        if(employee==null){
            throw  new EmployeeNotFoundException("employee with id "+ id +" is not found");
        }
        session.close();
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            session.persist(employee);
            tx.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        session.close();
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        Employee emp=null;
        try{
            tx.begin();
             emp=findById(id);
            emp.setSalary(employee.getSalary());
            emp.setDept(employee.getDept());
            session.merge(emp);
            tx.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        session.close();
        return emp;
    }

    @Override
    public Employee deleteById(int id) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        Employee emp=null;
        try{
            tx.begin();
            emp=findById(id);
            session.detach(emp);
            tx.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        session.close();
        return emp;
    }
}
