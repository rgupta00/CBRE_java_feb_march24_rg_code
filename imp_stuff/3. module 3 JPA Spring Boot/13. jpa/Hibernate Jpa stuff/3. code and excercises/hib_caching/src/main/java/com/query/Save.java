package com.query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Save {

	public static void main(String[] args) throws ParseException {
		
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
	
		Session session=factory.openSession();
		
		//JDBC : acid : connection.setAutocommit(false)
		
		SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		Date date1=fmt.parse("09/11/1976");
		
		Transaction tx=session.getTransaction();
		
		//Spring just make confi of any framework easy for you ( java based)
		//rather then explicit tx mgt :(
		//we can spring for decleartive tx :)
		
		try {
			tx.begin();
			Customer customer=new Customer("ekta", "delhi", "4545454545", "ekta@r.com", date1 );
			Customer customer2=new Customer("amit", "delhi", "4545454545", "amit@r.com", date1 );	
			Customer customer3=new Customer("gunika", "delhi", "4545454545", "gunika@r.com", date1 );
			Customer customer4=new Customer("keshav", "delhi", "4545454545", "keshav@r.com", date1 );
			
			session.save(customer);
			session.save(customer2);
			session.save(customer3);
			session.save(customer4);
			
			System.out.println("customer is added....");
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
		}
		
	
		
		if(factory!=null)
		factory.close();
		
	}
}
