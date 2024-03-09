package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("demo.xml");
		
		DataBean bean=context.getBean("dataBean", DataBean.class);
		System.out.println(bean);
	}
}
