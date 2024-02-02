package q3;

import java.util.Arrays;

/*
 * Write a method called copyOf(), 
 * which accept an int array and returns a copy of the given array. 
The method's signature is as follows:  public static int[] copyOf(int[] array) 
 */

class ArrayOp{
	
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}
	
}
public class AssignQ3 {

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=ArrayOp.copyOf(arr);
	}
}




