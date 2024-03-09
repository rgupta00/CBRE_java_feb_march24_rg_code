package com.demo6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("demo6.xml");
		
		TelephoneDirectoryAccessor telephoneDirectoryAccessor = ctx.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
		System.out.println("Kishan's contact no is:");
		System.out.println(telephoneDirectoryAccessor.getTelephoneNumber());
		
	
	}

}