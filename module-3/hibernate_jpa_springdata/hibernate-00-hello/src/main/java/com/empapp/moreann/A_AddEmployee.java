package com.empapp.moreann;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class A_AddEmployee {
    public static void main(String[] args) {

        //i want to create the object of employee class and want to save to db
        //1. grap the SF
        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        //2. u need to get Session from sf
        Session session=sessionFactory.openSession();//openSession vs getCurrentSession

        //3. we need to start a tx
        Transaction tx=session.getTransaction();//ACID
        try{
            tx.begin();

            Employee employee1=new Employee("ravi",6700,"IT");
            employee1.setDob(new Date());
            employee1.setLongTime(new Date());
            employee1.setTempPassword("temp pass");

            Employee employee2=new Employee("raj",9700,"Training");

            Employee employee3=new Employee("ekta",9710,"Fin");

            session.save(employee1);
            session.save(employee2);
            session.save(employee3);


            tx.commit();
        }catch (HibernateException ex){
           ex.printStackTrace();
            tx.rollback();
        }

        session.close();
        sessionFactory.close();





    }
}
