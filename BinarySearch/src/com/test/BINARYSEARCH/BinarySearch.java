/**
 * 
 */
package com.test.BINARYSEARCH;


/**
 * @author manukushavaha
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 40, 50, 60, 70, 80, 90, 100 };

		int sv = 50;
		int lv = 0;
		int hv = ar.length - 1;
		int middleV;
		if(ar[lv]==sv)
			System.out.println("Found in 1st position");
		else if(ar[hv]==sv)
			System.out.println("Found in last position");
		else {
		while (lv <= hv) {
			int midIndex = Math.round((hv + lv) / 2);
			int midV = ar[midIndex];
			if (midV == sv) {
				System.out.println("Found=" + sv);
				break;
			}
			if (midV < sv)
				lv = midIndex + 1;
			if (midV > sv)
				hv = midIndex - 1;

		}
		}

	}

}
