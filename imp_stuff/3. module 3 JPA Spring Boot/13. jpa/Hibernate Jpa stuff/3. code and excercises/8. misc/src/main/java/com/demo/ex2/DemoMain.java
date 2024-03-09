package com.demo.ex2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		Customer customer=new Customer(123, "r@gmail.com"	, "ravi", "delhi");
		session.save(customer);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}
