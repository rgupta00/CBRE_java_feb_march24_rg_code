package com.day5.ex6.map_examples;

import java.util.*;
public class D_HashMapVsHashTable {

	public static void main(String[] args) {
		//if u are looking for threadsafe map then u can go for ConcurrentHashMap* java 5
		
		Hashtable<String, Integer>map=new Hashtable<String, Integer>();
		map.put(null, 55);
		map.put(null, 505);
		System.out.println(map);
	}
}
