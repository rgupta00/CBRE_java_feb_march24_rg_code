package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class D_UpdateEmployee {
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
            Employee employeeToUpdate= session.get(Employee.class, 2);

            employeeToUpdate.setSalary(employeeToUpdate.getSalary()*1.1);

            session.update(employeeToUpdate);
            tx.commit();

        }catch (HibernateException e){
            e.printStackTrace();
        }

        session.close();

        sessionFactory.close();



    }
}
