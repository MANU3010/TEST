package com.test.selectionSort;

/**
 * @author manukushavaha
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int ar[] = { 34, 1, 5, 56, 77, 33, 3, 9, 0 };

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < ar.length; i++) {
			int minIndex = i;
			// Find the minimum element in unsorted array 
			for (int j = i+1; j < ar.length; j++) {
				if (ar[j] < ar[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the first element  
			int temp;
			temp = ar[minIndex];
			ar[minIndex] = ar[i];
			ar[i] = temp;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
