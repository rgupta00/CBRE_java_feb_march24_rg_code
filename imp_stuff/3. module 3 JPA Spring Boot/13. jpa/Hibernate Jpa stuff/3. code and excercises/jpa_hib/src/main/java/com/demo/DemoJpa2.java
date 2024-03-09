package com.demo;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoJpa2 {

	public static void main(String[] args) {
		// SessionFactory ---- EntityMangagerFactory
		// Persistance unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

		// Session ---------- EntityManager
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			Emp emp = new Emp("bar", "delhi", "797987798", "r@gmail.com", new Date());

			em.persist(emp);// db hit immediatly but rec is not commited
			System.out.println("emp saved....");
			
			//tx.commit();
			System.out.println("emp commited....");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

		em.close();
		emf.close();

	}
}
