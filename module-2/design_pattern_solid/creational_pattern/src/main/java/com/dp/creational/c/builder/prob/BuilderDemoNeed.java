package com.dp.creational.c.builder.prob;

public class BuilderDemoNeed {

	public static void main(String[] args) {
		Food food=new Food("pg",70,300, 300,800,799,5000);

		//if u are calling multiple setter it can create race condition somewhere
		Food f=new Food();
		f.setVitC(400);
		f.setName("pg");
	}
}
