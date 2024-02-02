package com.day5.ex2.set_examples;
import java.util.*;
public class A_HashSet {

	public static void main(String[] args) {

		//HashSet compose of Map
		//HashSet is best as compare to other as it is hashing*
		//HashSet dont maitane the order
//		Set<String> set=new TreeSet<>();
//
//		set.add("foo");
//		set.add("bar");
//		set.add("jar");
//		set.add("jar");
//
//		System.out.println(set);

		Set set=new TreeSet();//java red black tree algo

		set.add(new StringBuilder("foo"));
		set.add("foo");
		set.add("jar");
		set.add("jar");




	}
}
