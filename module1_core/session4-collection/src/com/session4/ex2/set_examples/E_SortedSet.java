package com.session4.ex2.set_examples;

public class E_SortedSet {

	public static void main(String[] args) {
		
		SortedSet<Integer> set=new TreeSet<>();
		set.add(100);
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);
		
		//getting first
		//getting last
		System.out.println(set);
//		System.out.println(set.headSet(106));
//		System.out.println(set.tailSet(106));
//		System.out.println(set.subSet(101,115));
		//headset(106)=> all element before 106
//		SortedSet<Integer> s1=  set.subSet(101,115);
//		set.removeAll(s1);
//		System.out.println(set);

		//tailSet(106)=> all element after and including 106
		
		//setset(101,115)
//
//		for(Integer d: set){
//			System.out.println(d);
//		}
//
		
		
		
		
	}
}
