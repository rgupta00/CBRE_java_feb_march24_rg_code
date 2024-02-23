package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class B_ShowAll {
    public static void main(String[] args) {

        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();//openSession vs getCurrentSession
        //ORM u will talk to hib in terms of object=> HQL(hib query lang)
        //i want to read all the records

        List<Employee> employeeList=session.createQuery("select e from Employee e", Employee.class).getResultList();
        employeeList.forEach(e-> System.out.println(e));

        session.close();
        sessionFactory.close();

    }
}
