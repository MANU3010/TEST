package com.test.BINARYSEARCH;

import java.util.Arrays;

public class BinarySearchWithRecursion {
	static boolean searchElement=false;

	public static void main(String[] args) {
		int[] ar = { 1, 40, 3, 2, 50, 60, 80, 70, 90, 100 };
		Arrays.sort(ar);
		int sv = 3;
		BinarySearchWithRecursion.recursionSearch(ar, sv);
		if(searchElement) {
			System.out.println(sv);
		}else {
			System.out.println("Element not found");
		}
		

	}

	public static void recursionSearch(int ar[], int sv) {

		int lv = 0;
		int hv = ar.length - 1;
		int midIndex = Math.round((hv + lv) / 2);
		int midV = ar[midIndex];

		if (lv <= hv && midV == sv) {
			searchElement=true;
		} else if (lv!=hv && midV < sv)
			 recursionSearch(Arrays.copyOfRange(ar, midIndex + 1, hv + 1), sv);
		else if(lv!=hv) {
			 recursionSearch(Arrays.copyOfRange(ar, lv, midIndex), sv);
		}

	}
}
