package noriegaMestanza;

import java.util.Scanner;

/** Sum of Digits
 * This program finds the sum of the digits of a number given by the user
 * @author 324032952
 * April 1st, 2017
 */
public class SumDigits {
	  public static void main (String [] args){

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number");
			int a = scan.nextInt();
			System.out.println("Your total sum is " + totalSum(a));
		
		  
	  }
	  public static int totalSum (int num){
		 int sum= 0;
			 do {
				
				 sum = num + num%10;	
				 sum = num/10;
					
					  
			 }while (num>0);
		 
			 
				 
				return sum; 
	  }
	  

}

