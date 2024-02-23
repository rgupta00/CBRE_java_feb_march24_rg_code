package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class C_ShowEmployeesById {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the session factory
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();

        //2. get the session from the session factory
        Session session=sessionFactory.openSession();//openSession() vs getCurrentSession()

        Employee employee=session.get(Employee.class, 20);// eager vs lazy

        System.out.println("-------------------------------");
        System.out.println(employee.getName());
        session.close();

        sessionFactory.close();



    }
}
