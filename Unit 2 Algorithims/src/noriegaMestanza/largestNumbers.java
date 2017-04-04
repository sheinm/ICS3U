package noriegaMestanza;

public class largestNumbers {
	public static void main (String [] args){
		  
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
