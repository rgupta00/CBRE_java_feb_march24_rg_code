package demo.java8.session1.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400),
						new Apple(
				"green", 300),
						new Apple("green", 200),
						new Apple("red", 250));


//		List<Apple> heavyApples= AppleApp.getAllpplesOnCondition(apples,Apple::isHeavyApple);
//		heavyApples.forEach(a-> System.out.println(a));

			List<Apple> heavyApples= AppleApp.getAllpplesOnCondition(apples,Apple::isGreen);
			heavyApples.forEach(a-> System.out.println(a));

			//green or heavy
			Predicate<Apple> heavyPredicate=Apple::isHeavyApple;
			Predicate<Apple> greenPrediate=Apple::isGreen;
			Predicate<Apple> greenOrHeavyPrediate=heavyPredicate.or(greenPrediate);

			List<Apple> heavyOrGreenApples= AppleApp.getAllpplesOnCondition(apples,greenOrHeavyPrediate);
			heavyOrGreenApples.forEach(a-> System.out.println(a));

	}
}

















