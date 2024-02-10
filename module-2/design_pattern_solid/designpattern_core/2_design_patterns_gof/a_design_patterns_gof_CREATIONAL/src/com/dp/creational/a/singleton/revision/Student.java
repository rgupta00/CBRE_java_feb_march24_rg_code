package com.dp.creational.a.singleton.revision;
//what is java reflection ? api to get info about meta data of class at run time
//all framework use it , hiberate? spring ? tomcat ? ... in java it is imposible to create a framework without java reflection
//friction is nessery evil=java reflection 
interface Study{
	public void study();
}

//u can create ur own annotation and process them using java reflection
//Hibernate

public class Student implements Study {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static final void foo() {
		System.out.println("hello foo");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@MyAnno(isValid = true, hello = "we all are super champs")
	@Override
	public void study() {
		System.out.println("student is stdying");
	}
}
