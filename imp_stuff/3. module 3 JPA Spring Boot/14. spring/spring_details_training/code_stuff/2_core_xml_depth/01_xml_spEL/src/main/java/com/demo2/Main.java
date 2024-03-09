package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Access static method and memebers
		ApplicationContext context=
				new ClassPathXmlApplicationContext("demo2.xml");
		
		Perimeter perimeter=context.getBean("peri", Perimeter.class);
		System.out.println(perimeter);
	}
}
