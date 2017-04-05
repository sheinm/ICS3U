package noriegaMestanza;

import java.util.Scanner;

public class Factorial {

	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int a = scan.nextInt();
		int factorial= factorial(a);
		System.out.println("Your factorial is" + factorial);
		

		  
	  } 
	
	public static int  factorial (int number) {
		
		
		
		for (int multiply= number-1; multiply> 0; multiply-- ) {
			 number = number*multiply;		 
		}
		return number;
		

	
		
	}
	
}
