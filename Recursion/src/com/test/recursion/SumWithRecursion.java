/**
 * 
 */
package com.test.recursion;

/**
 * @author manukushavaha
 *
 */
public class SumWithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6,3,4 };
		int index = 0;
		int sum=SumWithRecursion.calculate(arr, index);
		System.out.println(sum);

	}

	public static int calculate(int ar[],int index) {
		
		if(index==ar.length-1) {
			return ar[index];
		}
		
		return ar[index]+calculate(ar,index+1);
		
	}

}
