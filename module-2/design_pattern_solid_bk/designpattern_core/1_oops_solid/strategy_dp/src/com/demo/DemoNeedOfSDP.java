package com.demo;
//maths api where u need to manuplate array and need to apply sorting tech

interface Sortable{
	public int[] sort(int arr[]);
}
class BubbleSortable implements Sortable{

	@Override
	public int[] sort(int[] arr) {
		// BS
		System.out.println("bs");
		return null;
	}
	
}

class RadixSortable implements Sortable{
	@Override
	public int[] sort(int[] arr) {
		// Radix
		System.out.println("Radix");
		return null;
	}
}
class MergeSortable implements Sortable{
	@Override
	public int[] sort(int[] arr) {
		// Radix
		System.out.println("Merge");
		return null;
	}
}


class MathApi{
	private int arr[]=new int[10];
	
	private Sortable sortable=new BubbleSortable();
	
	public void setSortable(Sortable sortable) {
		this.sortable = sortable;
	}

	public void operation1() {
		//some op but u need sorted arrary
		System.out.println("operation 1 using sorting");
		int[] sort = sortable.sort(arr);
	}
	
	public void operation2() {
		//some op but u need sorted arrary
		int[] sort = sortable.sort(arr);
	}
}


public class DemoNeedOfSDP {
	
	public static void main(String[] args) {
		Sortable sortable=new MergeSortable();
		MathApi api=new MathApi();
		api.setSortable(sortable);
		api.operation1();
		
	}

}






