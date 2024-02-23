package com.empapp.basics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class C_GetById {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the EnittyManager factory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");

        //2. get the session from the EntityManager
        EntityManager em=emf.createEntityManager();

        //lazy vs eager featching
        //find vs getReference
        //get vs load(proxy the object from the db)
//        Employee e=em.find(Employee.class, 20);
//        System.out.println("--------------------------");
////        Employee e=em.getReference(Employee.class, 1);
//        System.out.println(e);

        Employee e=em.getReference(Employee.class, 2);
        System.out.println("--------------------------");
//        Employee e=em.getReference(Employee.class, 1);
        System.out.println(e);



        em.close();
        emf.close();




    }
}
