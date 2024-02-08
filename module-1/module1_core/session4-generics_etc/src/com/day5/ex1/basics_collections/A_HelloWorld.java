package com.day5.ex1.basics_collections;
import java.util.*;
public class A_HelloWorld {
	
	public static void main(String[] args) {
		//What is collection:
		//how to use ArrayList, LinkedList

		//java 21
		//type inference
		//java 7
		//Vehical v=new Car()
		List<String> list=new ArrayList<>();// Abs impleation SOLID, LSP*
		list.add("foo");
		list.add("bar");
		list.add("jar");
		//algo
		System.out.println(list);
		Collections.sort(list);
		int index=Collections.binarySearch(list, "apple");
		System.out.println("sorted list");
		System.out.println(list);
		System.out.println(index);

		//ds= data +str + algo
		List<String> list1=Collections.emptyList();//

		//classical interator dp
		//Iterator vs ListIterator vs enumerator(dont use it Vector)
		//using Iterator: we can only do iterator and deletion
		//ListIterator: iterate/ del/update/add back and forth

//		Iterator<String> it=list.iterator();
//		while (it.hasNext()){
//			System.out.println(it.next());
//		}
//
//		//Enhacce for loop java 5
//		for(String temp: list){
//			System.out.println(temp);
//		}
//		//java 8: foreach, Stream processing, functional programming
//		list.forEach(d-> System.out.println(d));//why it have have better performance*

		//System.out.println(list);




		//basics examples, sorting, searching printing

		//Vehicle v=new Car();

		//ArrayList : internally is a growable array
		//random acces is very fast



		//System.out.println(list);

		//java 5: syn suger on Iterator
//		for(String l: list){
//			System.out.println(l);
//		}
		//Iterator (cursor): Iterator, ListIteator, Enumeration (Vector)
		//Iterator is univeral cursor

//		List<String> list=new ArrayList<>();
//		list.add("foo");
//		list.add("bar");
//		list.add("jar");

		//Iterator vs Iteratable: custom iterator (Iterator dp)
//		Iterator<String>it=list.iterator();
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();

//		List<String> list=new ArrayList<>();
//		list.add("foo");
//		list.add("bar");
//		list.add("jar");
//
//		System.out.println(list);
//		list.subList(1,3).clear();
		//System.out.println(list);

//
//
//		System.out.println(list);
//		System.out.println("-------------------");
//		Collections.sort(list);
//		System.out.println(list);
//		//BS 0(log n)
//		int index=Collections.binarySearch(list,"foo");
//		System.out.println(index);

//		Iterator<String>it=list.iterator();
//		while (it.hasNext()){
//			it.next();
//			it.remove();
//		}




		//System.out.println(list.get(2));//O(1)
		
		//System.out.println(list);
		
		//one by one: using enhance for loop
		

//		System.out.println(list);
		
		//Sorting?
		
		
		//binary search ?
		
		
	}

	public List<String>getData(){
		List<String> list1=Collections.emptyList();//
		return list1;
	}

}
