package com.dp.creational.a.singleton.revision;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
		//get information about class student at run time
		
		//static class loading vs dynamic class loading
		Student student=new Student(22,"raj");
		Student student2=new Student(202,"tarun");
		
		//dynamic class loading
		Class<?> clazz = Class.forName("com.dp.creational.a.singleton.revision.Student");
		
		//meta data about the class
		Method[]methods=clazz.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method.getName()+": "+ method.getModifiers()+": "+Modifier.toString(method.getModifiers()));
			
			if(method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno=method.getAnnotation(MyAnno.class);
				System.out.println(anno.hello()+" : "+ anno.isValid());
			}
		}
		
		
		
		
	}
}









