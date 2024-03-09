package com.query;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {
	private static SessionFactory factory;

	private HibernateSessionFactory() {
	}

	public static SessionFactory getSessionFactory() {
		
		if (factory == null) {
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

		}
		return factory;
	}
}
