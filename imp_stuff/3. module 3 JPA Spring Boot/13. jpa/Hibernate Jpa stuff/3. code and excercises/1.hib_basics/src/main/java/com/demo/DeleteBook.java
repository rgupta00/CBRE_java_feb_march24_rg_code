package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DeleteBook {
	
	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		
		Session session=factory.openSession();
		
		//start the tr
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			//get that object 
			Book book=session.get(Book.class, 3);	//get vs load(proxy dp)
			//Session get: hit the db immdeitly .. .if object is not found then it return null (EAGAR WAY)
			
			//session load: hit the db in lazy way .. initially it give proxy of the object , 
			//object load when u try to accees data from that object
			if(book!=null) {
				session.delete(book);
			}else
				System.out.println("book is not found");
			
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		session.close();
		factory.close();
		
	}

}





