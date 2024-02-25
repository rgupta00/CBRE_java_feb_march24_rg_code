package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class D_GetById {
    public static void main(String[] args) {

        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();//openSession vs getCurrentSession


        //hibernate : eager and lazy
        //joins one to one  Parking Employee       ==> eager
        //joins one to many    Dept -- Employee    ==> lazy
        //joins many  to many   Emp   Project       ==> lazy
        // many to one      stud Prof               Eager

//        Employee employee=session.get(Employee.class,2);// get vs load
//        System.out.println("--------------------------------");
//        System.out.println(employee);

        Employee employee=session.load(Employee.class,2);// get vs load
        session.close();

        System.out.println("--------------------------------");

        System.out.println(employee);


        //session.evict(employee);

//        Employee employee2=session.get(Employee.class,2);
//        System.out.println(employee2);


        session.close();
        sessionFactory.close();

    }
}
