package com.day5.ex2.set_examples;
import java.util.NavigableSet;
import java.util.TreeSet;
public class F_NevagitableSet {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set=new TreeSet<>();
		set.add(100);
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);
		
		//lower(104) before 104
		Integer val=set.lower(117);
		System.out.println(val);

		//floor(101) at 101 or before
		
		//pollfirst()
		//pollLast()
		
		//heigher(101) => after 101
		//ceiling(101) => after 101 or at 101
		
		
		
//		for(Integer d: set){
//			System.out.println(d);
//		}
		
		
		
		
		
	}
}
