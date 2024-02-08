package com.day5.ex2.set_examples;
import java.util.*;
//MCQ
//When u are using custom object then u must override hashCode() method
//Hash
class Val implements Comparable<Val>{
	private  int v;
	public Val(int v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return new StringJoiner(", ", Val.class.getSimpleName() + "[", "]")
				.add("v=" + v)
				.toString();
	}
	@Override
	public int compareTo(Val o) {
		return Integer.compare(this.v, o.v);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Val val = (Val) o;
		return v == val.v;
	}

	@Override
	public int hashCode() {
		return Objects.hash(v);
	}
}
public class C_TreeSet {
	public static void main(String[] args) {
		Val v1=new Val(3);
		Val v2=new Val(3);

		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());

	Set<Val> set=new HashSet<>();//Hashing?
		set.add(new Val(24));
		System.out.println(set.contains(new Val(24)));

//		set.add(new Val(101));
//		set.add(new Val(4));
//		set.add(new Val(40));
//
//
//		for (Val val: set){
//			System.out.println(val);
//		}

	}
}
