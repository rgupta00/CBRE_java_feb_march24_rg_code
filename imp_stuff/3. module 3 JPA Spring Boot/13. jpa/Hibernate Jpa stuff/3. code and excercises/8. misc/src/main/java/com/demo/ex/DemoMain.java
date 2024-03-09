package com.demo.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		CustomerKey customerKey=new CustomerKey(121, "MA34");
		
		Customer customer=session.get(Customer.class, customerKey);
		System.out.println(customer);
		/*
		 * Customer customer=new Customer(customerKey, "raj", "delhi");
		 * session.save(customer);
		 */
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}
