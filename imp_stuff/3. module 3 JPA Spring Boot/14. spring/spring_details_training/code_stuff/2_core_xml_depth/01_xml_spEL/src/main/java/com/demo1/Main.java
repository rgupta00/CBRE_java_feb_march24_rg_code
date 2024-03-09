package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Access static method and memebers
		ApplicationContext context=
				new ClassPathXmlApplicationContext("demo1.xml");
		
		Foo foo=context.getBean("foo",Foo.class);
		foo.print();
			
	}
}
