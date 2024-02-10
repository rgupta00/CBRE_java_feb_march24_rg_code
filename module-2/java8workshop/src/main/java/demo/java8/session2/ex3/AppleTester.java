package demo.java8.session2.ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400),
						new Apple(
				"green", 300),
						new Apple("green", 200),
						new Apple("red", 250));

		//lamabda and method ref

			// i want to get all heavy applies
//			Predicate<Apple> heavyApplePredicate= a-> a.getWeight()>=250;

			Predicate<Apple> heavyApplePredicate= Apple::isHeavyApple;

			Predicate<Apple> heavyApplePredicateV2= AppleLogic::isHeavy;

			Predicate<Apple> heavyGeenApples= Apple::isGreen;


//		Predicate<Apple>p1= a->a.getWeight()>=250;
//		Predicate<Apple> p2=a->a.getColor().equals("green");
//		List<Apple> heavyApples=AppleApp.getAllpplesOnCondition(apples,p1);
//		List<Apple> greenApples=AppleApp.getAllpplesOnCondition(apples,p2);
//
//		//heavy as well as green
//			Predicate<Apple> p3=p1.or(p2);
//			List<Apple> greenAndHeavyApples=AppleApp.getAllpplesOnCondition(apples,p3);
//
//			greenAndHeavyApples.forEach(a-> System.out.println(a));
	}
}

















