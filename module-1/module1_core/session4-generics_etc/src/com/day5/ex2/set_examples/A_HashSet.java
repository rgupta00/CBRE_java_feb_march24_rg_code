package com.day5.ex2.set_examples;
import java.util.*;
class MySorter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
	}
}
public class A_HashSet {

	public static void main(String[] args) {

		//HashSet compose of Map
		//HS LSH TS
		//HashSet is best as compare to other as it is hashing*
		//HashSet dont maitane the order
		//Set<String> set=new TreeSet<>();
		//Set<String> set=new TreeSet<>(new MySorter());
//		System.out.println(set.add("foo"));
//		System.out.println(set.add("foo"));
//		System.out.println(set.add("bar"));
//		System.out.println(set.add("car"));
//
//		set.add("amit");
//		set.add("amit k");
//		set.add("amit ku");
//		set.add("amit kum");
//
//		System.out.println(set);

		Set set=new TreeSet();//java red black tree algo

		set.add(new StringBuilder("foo"));
		set.add("foo");
		set.add("jar");
		set.add("jar");

		System.out.println(set);



	}
}
