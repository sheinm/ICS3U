package noriegaMestanza;

import java.util.Scanner;

/**
 * Is Divisible Program This program finds out if a number is divisible by
 * another number
 * 
 * @author 324032952 April 3rd, 2017
 */
public class isDivisble {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = scan.nextInt();
		System.out.println("Please enter another number");
		int b = scan.nextInt();
		 if (isDivisible(a,b)){
			 System.out.println("The first number that you entered is divisble by the second number");
			 
		 }
		 else{
			 System.out.println("The numbers that you entered are not divisible by eachother");
		 }
	}

	/**
	 * This method uses boolean features to determine whether or not one number
	 * is divisible or not by another
	 * 
	 * @param a
	 *            First number, will be divided by integer b
	 * @param b
	 *            Second number, will divide a
	 * @return Returns whether or not integer a is divisible by integer b/
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;

	}

}
