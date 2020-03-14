/**
 * 
 */
package com.test.recursion;

/**
 * @author manukushavaha
 *
 */
public class AccidentallyRecursiveProgram {
	public static void main(String[] args) {
		try {
			AccidentallyRecursiveProgram.calculate(2);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	}

	
	public static int calculate(int i) {
		if (i == 1) {
			return i;
		} else
		return i *calculate(i+1);
	}
	
}
