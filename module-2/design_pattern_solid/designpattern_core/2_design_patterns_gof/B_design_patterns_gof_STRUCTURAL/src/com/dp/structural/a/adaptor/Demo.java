package com.dp.structural.a.adaptor;

public class Demo {

	public static void main(String[] args) {

		RoundPeg peg = new RoundPeg();
		
		//useSquarePeg(peg);
	}
	
	public static void useSquarePeg(SquarePeg peg) {
		//do some operation
		peg.insert("some random shape");
	}
}
