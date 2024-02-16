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

//		Optional<String> opt=Optional.empty();
//		System.out.println(opt.orElse("not found"));

//		Optional<String> opt=Optional.ofNullable(null);
//		System.out.println(opt.orElse("not found"));

		Optional<String> opt=Optional.ofNullable(null);
//		System.out.println(opt.orElse("not found"));
		System.out.println(opt.orElseThrow(()->new RuntimeException("data not found")));//IMP
		/*
		Optional will give u better way to handle NPEx
		 */

//		String cityName=getCityV1(55);
//		if(cityName!=null) {
//			System.out.println(cityName.toUpperCase());
//		}else
//			System.out.println("city is not found");

//		Optional<String> cityOpt=getCityV2(77);
//
//		String cityName=cityOpt.orElse("city not found");
//		System.out.println(cityName);


	}

	//ravi
	public static String getCityV1(int cordinate){
		//
		return  null;
	}








	//ravi
	public static Optional<String> getCityV2(int cordinate){
		//
		return  Optional.ofNullable("noida");
	}

//	//ravi

}






