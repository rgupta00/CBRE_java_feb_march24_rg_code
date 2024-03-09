package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class GetAllBooks {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		Session session=factory.openSession();
		
		//we want ot print all books infor
										//HQL
		List<BookDto> books=session.createQuery("select new com.demo.BookDto(b.title, b.price) from Book b").getResultList();
		books.forEach(bdto-> System.out.println(bdto));
		
		
		//books.forEach(b-> System.out.println(b));
//		for(Object temp[]: books) {
//			System.out.println(temp[0]+": "+ temp[1]);
//		}
	}
}
