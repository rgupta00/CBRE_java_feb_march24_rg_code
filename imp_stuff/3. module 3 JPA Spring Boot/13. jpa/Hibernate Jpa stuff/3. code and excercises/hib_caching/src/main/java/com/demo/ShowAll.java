package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ShowAll {

	public static void main(String[] args) {
		//show all customers 
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		
		Session session=factory.openSession();// getCurrentSession vs openSession
		
		//HQL OO version of SQL
		//native Quaries
		/*
		 * List<Customer> customers=
		 * session.createNativeQuery("select * from customer_table",
		 * Customer.class).getResultList();
		 * 
		 * customers.forEach(c-> System.out.println(c));
		 */
		
		//select c from Customer c
		//from Customer
		//
//		List<Customer> customers=session
//				.createQuery("select c from Customer c where id=:id")
//				.setParameter("id",2)
//				.getResultList();
//
//		customers.forEach(c-> System.out.println(c));
//		
//		 Optional<Customer> custoOpt=session
//				.createQuery("select c from Customer c where id=:id")
//				.setParameter("id",4)
//				.uniqueResultOptional();
//		 
//		 System.out.println(custoOpt.orElseThrow(()-> new RuntimeException()));
		
		
		//session.createQuery("select c from Customer c").stream().forEach(c-> System.out.println(c));
		
		//?: why hell it gives error?
		//---------------------
//		session.createQuery("SELECT c FROM Customer c", Customer.class).stream()
//		   .map(Customer::getName)
//		   .forEach(System.out::println); 
		
		
		//List<Customer> customers = session.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
		
		//customers.stream().forEach(c-> System.out.println(c));
//		List<Object[]> customers=session
//				.createQuery("select c.name, c.mobile from Customer c")
//				.getResultList();
//		//customers.forEach(cn-> System.out.println(cn));
//		for(Object[] temp: customers) {
//			System.out.println(temp[0]+":"+temp[1]);
//		}
		//hey java can u do a favour for me... 
		//just take this pojo and push data into that pojo and give me the list of that
		
		
//		List<CustomerData> customers=session
//				.createQuery("select new com.demo.CustomerData(c.name, c.mobile) from Customer c")
//				.getResultList();
//		for(CustomerData data: customers) {
//			System.out.println(data);
//		}
		
		factory.close();
		
	}
}
