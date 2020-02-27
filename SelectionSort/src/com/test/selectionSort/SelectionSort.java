package com.test.selectionSort;

/**
 * @author manukushavaha
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int ar[] = { 156, 78, 73, 90, 23, 0, 4, 234, 89 };

		int lengthOfArray = ar.length;

		for (int i = 0; i < lengthOfArray ; i++) {
			int min_idx_Value = i;
			for (int j = i + 1; j < lengthOfArray; j++) {
				if (ar[j] < ar[min_idx_Value])
					min_idx_Value = j;
			}
				int temp = ar[min_idx_Value];
				ar[min_idx_Value] = ar[i];
				ar[i] = temp;
			
		}
		//Sorted Value Selection sort
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
