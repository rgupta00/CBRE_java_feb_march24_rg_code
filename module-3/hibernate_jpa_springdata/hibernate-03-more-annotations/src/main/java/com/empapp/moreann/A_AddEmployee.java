package com.empapp.moreann;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class A_AddEmployee {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the session factory
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();

        //2. get the session from the session factory
        Session session=sessionFactory.openSession();//openSession() vs getCurrentSession()

        //3. u need to start the tx

        Transaction tx=session.getTransaction();

        try{
            tx.begin();
            Date dob=new Date();
            Date loginTIme=new Date();

            //(String name, double salary, String dept, String tempPassword, Date dob, Date loginTime, EmpType empType)
               Employee employee1=new Employee("amit",7800,"abc123","SALES",dob ,loginTIme, EmpType.FT);


            session.save(employee1);


            tx.commit();

        }catch (HibernateException e){
            e.printStackTrace();
        }

        session.close();

        sessionFactory.close();



    }
}
