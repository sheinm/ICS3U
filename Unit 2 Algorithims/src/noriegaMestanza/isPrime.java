package noriegaMestanza;

import java.util.Scanner;

/**
 * Prime Number This program determines if the number is prime or not
 * 
 * @author 324032952 April 1st, 2017
 */

public class isPrime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();

			if (primeNum(number) == true) {
			System.out.println("The number you entered is a prime number");
		} else {
			System.out.println("This is not a prime number");
		}

	}

	/**
	 * This method determines whether a number is prime or not
	 * 
	 * @param a
	 *            the first integer
	 * @param b
	 *            the second integer
	 * @return whether the number is prime or not
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	/**
	 * This method determines whether the number is prime using the isDivisble
	 * method
	 * 
	 * @param number
	 * @return whether the number is divisible by itself and one or not
	 */
	public static boolean primeNum(int number) {
		for (int i = 2; i < number; i++) {
			if (isDivisible(number, i) == true) {
				return false;
			}
		}
		return true;
	}

}
