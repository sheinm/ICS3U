package noriegaMestanza;

import java.util.Scanner;

public class largestNumbers {
	public static void main (String [] args){

		
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		int[] noot = new int[inputs];
		for(int x = 0; x < inputs; x++){
			noot[x] = scan.nextInt();
		}
		
		System.out.println(largestNumber(noot));
	  }
	public static int largestNumber (int [] number ) {
		int biggestNumber = 0;
		for ( int i =  0; i<number.length-1; i++ ){
			if (number[i] > number[i+1]){
				biggestNumber = number[i];
			}
		}
		
		return biggestNumber;
	}

}
