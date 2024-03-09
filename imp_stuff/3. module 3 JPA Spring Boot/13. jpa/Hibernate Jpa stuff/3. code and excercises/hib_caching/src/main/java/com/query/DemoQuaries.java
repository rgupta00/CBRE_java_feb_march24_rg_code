package com.query;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import net.sf.ehcache.util.CircularLossyQueue;
import java.util.*;
public class DemoQuaries {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria=session.createCriteria(Customer.class);
		
		Map<String, String>map=new HashMap<>();
		map.put("name", "amit");
		map.put("email", "ekta@r.com");
		//	hey hibernate put all the things of maps a where clause
		
		criteria.add(Restrictions.allEq(map));
		List<Customer> customers=criteria.list();

		for(Customer customer: customers) {
			System.out.println(customer);
		}

//		Query<Customer> query = session.createNamedQuery("findAllNative", Customer.class);
//		
//		List<Customer> customers=query.getResultList();
//		for(Customer customer: customers) {
//			System.out.println(customer);
//		}

	}
}
