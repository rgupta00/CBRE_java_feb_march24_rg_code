package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("demo.xml");
		
		ProductStore productStore = context.getBean("productStore", ProductStore.class);
		productStore.printDetails();
		
	}
}
