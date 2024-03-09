package com.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Get {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Customer customer=session1.get(Customer.class, 1);
		System.out.println(customer);
		session1.close();
		
		
		Session session2=factory.openSession();
		 customer=session2.get(Customer.class, 1);
		System.out.println(customer);
		session2.close();
		
		
	}
}
