package com.empapp.basics;

import com.util.factory.EmFactoy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class A_AddEmployee {
    public static void main(String[] args) {


        EntityManagerFactory emf=EmFactoy.getSessionFactory();


        EntityManager em=emf.createEntityManager();


        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();

            Employee employee1=new Employee("ravi",6700,"IT");

            Employee employee2=new Employee("raj",9700,"Training");

            Employee employee3=new Employee("ekta",9710,"Fin");

            em.persist(employee1);
            em.persist(employee2);
            em.persist(employee3);


            tx.commit();
        }catch (HibernateException ex){
            tx.rollback();
        }

        em.close();
        em.close();





    }
}
