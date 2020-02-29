package com.test.recursion;

public class Factorial {

	public static void main(String[] args) {
		int i = Factorial.calculateFactorial(5);
		System.out.println(i);
	}

	public static int calculateFactorial(int factValue) {
		if (factValue == 1) {
			return factValue;
		} else {
			return factValue * calculateFactorial(factValue - 1);
		}

	}
}
