package com.day5.ex1.basics_collections;
import java.util.*;

public class C_PerformanceComparisionALvsLL {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		//time taken: 1126 ms
		//time taken: 7 ms
		calculatePerformance(list2);
	}

	//peroframce diff bw LL and AL
	 static void calculatePerformance(List<Integer> list) {
		 for(int i=0;i<1E5; i++) {
			 list.add(i);
		 }
		long start=System.currentTimeMillis();
		
		for(int i=0;i<1E5; i++) {
			 list.add(0,i);
		 }
		long end=System.currentTimeMillis();

		System.out.println("time taken: "+(end-start)+" ms");
	}

}
