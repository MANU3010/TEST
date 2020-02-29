package com.test.selectionSort;

public class FabonicSeries {
	static int firstVal = 0;
	static int secondVal = 1;
	int thirdVal = 0;

	public static void main(String[] args) {
		System.out.println(firstVal+"\n"+secondVal);
		FabonicSeries series = new FabonicSeries();
		series.FabonicCount(10);

	}

	public void FabonicCount(int value) {

		if (value > 0) {
			thirdVal = firstVal + secondVal;
			firstVal = secondVal;
			secondVal = thirdVal;
			System.out.println(thirdVal);
			FabonicCount(value - 1);

		}
	}
}
