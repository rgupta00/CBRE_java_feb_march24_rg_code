package com.session4.ex5.generics_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Emp{
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Emp{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
public class B_NeedOfGenerics {
	
	public static void main(String[] args) {
		//What is generics
		//"compile time safty net" provide type safty to the collection
		//"is type erased"
		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		print(list);

		List<Double> list2=new LinkedList<>();
		list2.add(1.0);
		list2.add(2.7);
		print(list2);

		List<Emp> list3=new LinkedList<>();
		list3.add(new Emp(1,"raj"));
		list3.add(new Emp(11,"ekta"));

		print(list3);
	}
	//PECS rule* Producer Extends (agar collection say bas print karana ho to ...)
	// and Consmer Super

	//? extends XX => upper bound
	//? super XX  => Lower bound
//	public static void print(List<? extends Object> list){
//		//print the data but u can not change the data?
//		//list.add("foo");
//		for (Object temp: list){
//			System.out.println(temp);
//		}
//	}

	public static void print(List<?> list){
		//print the data but u can not change the data?
		//list.add("foo");
		for (Object temp: list){
			System.out.println(temp);
		}
	}




//	public static void print(List<Double> list){
//		for (Double temp: list){
//			System.out.println(temp);
//		}
//	}

	public static void foo(List list){
		list.add("foo");
	}

}


//		List<String> list=new LinkedList<>();
//		list.add("21");
//		list.add("foo");
//
//		for(String d: list){
//			System.out.println(d);
//		}

//dont mix gen and non gen
//		foo(list);

//	int sum=0;
//		for(Integer temp: list){
//			sum+=temp;
//		}
//		System.out.println(sum);