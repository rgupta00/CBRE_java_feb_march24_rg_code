package com.dp.creational.c.builder.ex;

public class DemoBuilderDP {
	
	public static void main(String[] args) {
		//StringBuilder
		
		String a="foo"+"bar"+"jar"+"car";//good code or bad code
		//it polute string pool?
		//how to make object creation easy
		String b=new StringBuilder().append("foo").append("bar").append("jar").append("car").toString();

		
	}

}
