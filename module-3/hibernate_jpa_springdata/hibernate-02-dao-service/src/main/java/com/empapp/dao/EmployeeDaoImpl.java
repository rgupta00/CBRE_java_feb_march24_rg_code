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
        Session session=sessionFactory.openSession();//openSession vs getCurrentSession
        List<Employee> employeeList=session.createQuery("select e from Employee e",Employee.class).getResultList();
        session.close();
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Session session=sessionFactory.openSession();//openSession vs getCurrentSession
        Employee employee=session.get(Employee.class, id);
        if(employee==null)
            throw new EmployeeNotFoundException("employee not found");
        session.close();
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            session.save(employee);
            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
            tx.rollback();

        }
        return  employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Session session=sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            Employee employeeToUpdate=findById(id);
            employeeToUpdate.setSalary(employee.getSalary());
            session.update(employeeToUpdate);

            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
            tx.rollback();
        }
        return employee;
    }

    @Override
    public Employee deleteById(int id) {
        return null;
    }
}
