package com.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {

		/*
		 * 
		 */
		AbstractApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("productapp.xml");
		
		applicationContext.registerShutdownHook();
		Product product=applicationContext.getBean("p", Product.class);
		System.out.println(product);
		
	}

}
