package com.day5.ex7.queue_examples;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class A_DemoQueue {
	
	public static void main(String[] args) {
		//non blocking is not thread safe
		Queue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});

		queue.add(33);
		queue.add(3);
		queue.add(303);
		queue.add(13);

//		Iterator<Integer> it=queue.iterator();
//		while (it.hasNext()){
//			System.out.println(it.next());
//		}

		//min heap and max heap
		while (!queue.isEmpty()){
			System.out.println(queue.poll());
		}




	}

}
