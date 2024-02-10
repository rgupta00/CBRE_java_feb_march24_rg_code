package demo.java8.session2.ex6;

import java.util.Optional;
import java.util.function.Supplier;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */
class CityNotFoundEx extends RuntimeException{}
public class DemoOptional {
	public static void main(String[] args) {

		//Optional is a like a box which can wrap a object
		//use of optional to tell another party that is a possible of null
		//so that he should be aware

		String s=null;
		//Optional<String> stringOpt=Optional.of(s);
		//Optional<String> stringOpt=Optional.ofNullable(s);


//		Optional<String> stringOpt2=Optional.empty();
//		System.out.println(stringOpt2.orElse("not found"));

		Optional<String> stringOpt2=Optional.empty();
		//Optional<String> stringOpt2=null;
		System.out.println(stringOpt2.orElse("not found"));

		System.out.println("----------------");


		//Optional<String> stOpt= getCityV2(34);

//		String name=stOpt.orElse("not found");
//		System.out.println(name);

//		String name=stOpt.orElseThrow(()-> new CityNotFoundEx());
//
//		System.out.println(name);



//		String cityName=getCityV1(31);
//		if(cityName!=null)
//			System.out.println(cityName.toLowerCase());
//		else
//			System.out.println("not found");
	}


	//ravi
	public static Optional<String> getCityV2(int cordinate){
		//
		return  Optional.ofNullable(null);
	}

//	//ravi
	public static String getCityV1(int cordinate){
		//
		return  null;
	}
}






