package com.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class AddBook {

	
	public static void main(String[] args) {
		//hibernate session factory 
		//hibernate magage life cycle of entity
		// container : SessionFactory is the container that manage life cycle of object
		
		//HibernateSessionFacotory -------------> SessionFactory 
		
		//1. create sessionfactory
		StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		
		SessionFactory factory=new MetadataSources(serviceRegistry)
				.buildMetadata().buildSessionFactory();
		
		//2. session object : Session
		Session session=factory.openSession();         //Session session=factory.getCurrentSession()
		
		//3. start the tx
		session.getTransaction().begin();
		
		//Create the  book object and save with hib
		//Book book=new Book(isbn, title, author, pubDate, price)
		Book book=new Book("M407", "MEAN in action", "bar", new Date(), 700);
		book.setRank(2);
		
		session.save(book);
		
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();
	}
}













