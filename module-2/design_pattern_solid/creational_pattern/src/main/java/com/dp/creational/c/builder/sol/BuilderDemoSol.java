package com.dp.creational.c.builder.sol;

public class BuilderDemoSol {

	public static void main(String[] args) {
		//what parameter stand for what?
//		Food food=new Food();
//		food.setName("cold drink");
//		food.setUnit(400);
//		food.setVitB12(0);
//		food.setVitB5(300);
//
		//public Food(String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD)
//		Food food1=new Food("pg",70,300);
//		Food food3=new Food("pg",70,300);

		Food food2=new FoodBuilder("pg",75).
				setVitC(300)
				.setVitA(4000).setVitD(70000).build();
		System.out.println(food2);
		//System.out.println(food);
		//lambda ex, mockito... fluent api
	}
}
