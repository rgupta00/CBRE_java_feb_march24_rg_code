package com.empapp.basics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class D_UpdateEmployee {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the EnittyManager factory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");

        //2. get the session from the EntityManager
        EntityManager em=emf.createEntityManager();

        //3. u need to start the tx
        EntityTransaction tx=em.getTransaction();


        try{
            tx.begin();
            Employee employeeToUpdate= em.find(Employee.class, 1);
            employeeToUpdate.setSalary(employeeToUpdate.getSalary()*1.1);
            em.merge(employeeToUpdate);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

        em.close();
        emf.close();




    }
}
