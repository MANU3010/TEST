/**
 * 
 */
package com.test.quicksort;

/**
 * @author manukushavaha
 *
 */
public class QuicksortAlgo {

	public static void main(String[] args) {
		int ar[] = { 9, 3, 8, 2, 7, 5, 0, 1, 6, 22 };
		int low = 0;
		int high = ar.length - 1;
		shorting(ar, low, high);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

	public static void shorting(int ar[], int low, int high) {
		if (low < high) {
			int partion = devideArray(ar, low, high);
			shorting(ar, low, partion - 1);
			shorting(ar, partion + 1, high);
		}

	}

	public static int devideArray(int ar[], int low, int high) {
		int pvoit = ar[low];
		int st = low;
		int end = high;
		while (st < end) {
			while (ar[st] <= pvoit && st < high) {
				st++;
			}
			while (ar[end] > pvoit && end > low) {
				end--;
			}
			if (st < end) {
				exchange(ar, st, end);
			}

		}
		exchange(ar, end, low);
		return end;

	}

	public static void exchange(int ar[], int st, int end) {
		int tmp = ar[end];
		ar[end] = ar[st];
		ar[st] = tmp;
	}

}
