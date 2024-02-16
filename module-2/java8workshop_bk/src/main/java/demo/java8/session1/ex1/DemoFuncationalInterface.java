package demo.java8.session1.ex1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

interface Food{
	public void cook();
}
@FunctionalInterface
interface Cal{
	//java 8
	public default void fooDefault(){
		System.out.println("it can have default method");
	}
	public static void fooStatic(){
		System.out.println("foo statatic method");
	}
	public int add(int a, int b);
}

public class DemoFuncationalInterface {
	public static void main(String[] args) {


	//key functional interface in java 8



		//type inference
		//			peice of code/function
		//Food f=     ()-> System.out.println("street food good in taste but never know");

		//Food f2=()-> System.out.println("street food good in taste but never know");
		//      it is a object
//		Food f2=new Food() {
//			@Override
//			public void cook() {
//				System.out.println("hotel food good in taste heavy on pocket");
//			}
//		};


		/*
		what is funcational interface =>
		lambda expression vs ann inner class
		how to do funcational programing in java aka decleratitive programing in java
		//stream processing in java
		 */
		//SAM: single abs method ->Fuctional interface-> lambda
//		Runnable runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("job of thread");
//			}
//		};

		Thread thread=new Thread(() -> System.out.println("job of thread"));

		Cal cal=( a,  b)-> a+b;

		System.out.println(cal.add(3,5));

		//https://en.wikipedia.org/wiki/Functional_programming
	    //FP=immutablity + higher order funcation + currying +....

//		List<String> names=new LinkedList<>();
//		names.add("sumit");
//		names.add("ram");
//		names.add("ekta");
//
//		Comparator<String>comparator=( o1,  o2)-> o1.compareTo(o2);
//
//
//		Collections.sort(names, comparator);
//		names.stream().forEach(name-> System.out.println(name));

//		for(String name: names){
//			System.out.println(name);
//		}
	}
}
