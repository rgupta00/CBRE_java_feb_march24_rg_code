package demo.java8.session1.ex1;

//calculating prime no bw 1 to 1_000_0
class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class A_MotivationJava8 {
	public static void main(String[] args) {


//		//java 8 traning session
//		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
//		System.out.println(Runtime.getRuntime().availableProcessors());
//		//funcational/declerative (what to do) vs imparative (what to do , how to do?)
//		long start=System.currentTimeMillis();
//
//		long counter=LongStream.rangeClosed(1,160_00)
//				.filter(Prime::isPrime)
//				.parallel()
//				.count();
//
//		long end=System.currentTimeMillis();
//		System.out.println("counter: "+ counter);
//		System.out.println("time taken: "+ (end-start)+" ms");

//		long counter=0;
//		for(long i=0;i<10000;i++){
//			if(Prime.isPrime(i)){
//				counter++;
//			}
//		}






		//Fork and join framework

		//Thread pool
		//


		/*
		 *
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8

		 */
	}

}
