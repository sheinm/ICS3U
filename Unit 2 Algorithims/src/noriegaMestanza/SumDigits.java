package noriegaMestanza;
/** Sum of Digits
 * This program finds the sum of the digits of a number given by the user
 * @author 324032952
 * April 1st, 2017
 */
public class SumDigits {
	  public static void main (String [] args){
		  
	  }
	  public static int totalSum (int num){
		 int sum= 0;
			 do {
				
				 sum = num + num%10;	
				 sum = num/10;
					
					  
			 }while (num>0);
		 
				sum  = num ;
				 
				return totalSum; 
	  }
	  

}

