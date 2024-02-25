package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class C_Update {
    public static void main(String[] args) {

        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();//openSession vs getCurrentSession

        Transaction tx=session.getTransaction();//ACID
        try{
            tx.begin();
            Employee employee=session.get(Employee.class, 1);
            employee.setSalary(employee.getSalary()*1.1);

            session.update(employee);

            tx.commit();
        }catch (HibernateException ex){
            tx.rollback();
        }

        session.close();
        sessionFactory.close();





    }
}
