package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
/*
 * 	BeanFactory vs ApplicationContext
 * 
 * BeanFactory:
 *  - light weight container , dont support many featues
 *  - dont use it
 *  BeanFactory applicationContext=new XmlBeanFactory(new ClassPathResource("demo.xml"));
 *  
 *  ApplicationContext 
 *  - more powerful
 *  ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("demo.xml");
				
	ApplicationContext
		-ClassPathXmlApplicationContext
		-FileSystemXmlApplicationContext
		-AnnotationConfigApplicationContext
		-XMLWebApplicationContext
 */
public class Main {
	public static void main(String[] args) {

//		ApplicationContext applicationContext=
//				new ClassPathXmlApplicationContext("demo.xml");
//		ApplicationContext applicationContext=
//				new FileSystemXmlApplicationContext("demo.xml");
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext("demo.xml");
		
//		BeanFactory applicationContext=new XmlBeanFactory(new ClassPathResource("demo.xml"));
//		
		Passanger passanger=applicationContext.getBean("passanger", Passanger.class);
		passanger.travel();
		
	}

}
