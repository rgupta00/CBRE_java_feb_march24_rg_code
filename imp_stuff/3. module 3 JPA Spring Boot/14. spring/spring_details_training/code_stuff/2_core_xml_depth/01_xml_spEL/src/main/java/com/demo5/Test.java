package com.demo5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo5.xml");
		
		StudentListAccessor studentListAccessor = ctx.getBean("studentListAccessor", StudentListAccessor.class);
		
		
		Student student = studentListAccessor.getThirdStudentInList();
		System.out.println("Third Student in the List:::");
		System.out.println(student.getName()+"\t"+student.getMarks());
		
		System.out.println("------------------------------");
		
		List<String> studentNames = studentListAccessor.getStudentNames();
		System.out.println("Names of Student in the list::");
		for (String name : studentNames) {
			System.out.println(name);
			
		}
		List<Student> failedStudents = studentListAccessor.getFailedStudents();
		
		System.out.println("List of failed Students:::");
		for (Student student2 : failedStudents) {
			
			System.out.println(student2.getName()+"\t"+student2.getMarks());
			
		}
		((AbstractApplicationContext) ctx).close();
	}
}