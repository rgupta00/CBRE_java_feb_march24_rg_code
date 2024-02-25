package com.util.factory;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmFactoy {

    private static EntityManagerFactory sf=null;
    private EmFactoy(){}

    public static EntityManagerFactory getSessionFactory(){
      EntityManagerFactory emf= Persistence.
              createEntityManagerFactory("cbre");
      return emf;
    }

}
