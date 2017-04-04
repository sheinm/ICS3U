package noriegaMestanza;

import java.util.Scanner;

/**
 * This program finds the greatest common factor between two numbers. 
 * @author 324032952
 * April 4th, 2017
 */

public class GreatestCommonFactor {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a");
		int a = scan.nextInt();
		System.out.println("Please enter b");
		int b = scan.nextInt();

	}

}

/**
 * This method determines if integer a is divisible by integer b
 * @param a
 * @param b
 * @return
 */
public static boolean isDivisible (int a , int b) {
	if (a%b== 0) {
		return true;
	}
	{
		return false;
	}
	public static int greatestCommonfactor (int a, int b){
		if (a == b){
			//return????
		}
		return greatestCommonfactor (b, a%b);


	}
}
