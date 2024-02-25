package com.empapp.basics;

import com.util.factory.EmFactoy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.hibernate.HibernateException;

import java.util.List;

public class B_ShowAll {
    public static void main(String[] args) {


        EntityManagerFactory emf=EmFactoy.getSessionFactory();


        EntityManager em=emf.createEntityManager();
        //HQL JPQL

        List<Employee> employeeList=em.createQuery("select e from Employee e",Employee.class).getResultList();
        employeeList.forEach(e-> System.out.println(e));

        em.close();
        em.close();





    }
}
