package d;

import java.util.*;

public class PriorityQueExample {

	public static void main(String[] args) {
		PriorityQueue<Product> priorityQueue =
				new PriorityQueue<Product>(new ProductSortAsPerPrice());
	
		priorityQueue.offer(new Product(1	, "tv", 59000));
		priorityQueue.offer(new Product(13	, "laptop", 99000));
		priorityQueue.offer(new Product(113	, "laptop mouse", 590));
		priorityQueue.offer(new Product(101	, "ms word", 5900));
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	
	}
}
