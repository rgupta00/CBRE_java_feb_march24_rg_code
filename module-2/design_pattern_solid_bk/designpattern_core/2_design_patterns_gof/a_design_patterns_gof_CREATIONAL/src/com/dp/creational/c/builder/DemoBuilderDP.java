package com.dp.creational.c.builder;

public class DemoBuilderDP {
	
	public static void main(String[] args) {
		//StringBuilder
		
		String a="foo"+"bar"+"jar"+"car";//good code or bad code
		//it polute string pool?
		
		
		String b=new StringBuffer().append("foo").append("bar").append("jar").append("car").toString();
		
		
		
//		String hello="i love java";
//	
//		String helloRev=new StringBuilder().append(hello).reverse().toString();
//		
		
		
		//fluent api design : mockito, mock testing
		//java 8 
		String builder=new StringBuilder().append("foo").append("bar").append("jar").toString();
		
		
	}

}
