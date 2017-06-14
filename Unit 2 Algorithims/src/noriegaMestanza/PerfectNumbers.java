package noriegaMestanza;
/**
 * This program checks to see if the number is a perfect number
 * @author 324032952
 * April 20th, 2017
 */
public class PerfectNumbers {
	public static void main(String[] args) {
		for(int i = 0;i<=100;i++){
			int sum = 0;
			for (int secondnum = 1; secondnum < i ; secondnum++) {
				if (isDivisible(i, secondnum)) {
					sum += secondnum;	
				}


			}
			if (sum == 1){
				System.out.println(i);
			}

		}
	}


	public static boolean isDivisible (int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;

	}

}

