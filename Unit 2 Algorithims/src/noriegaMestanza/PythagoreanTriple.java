package noriegaMestanza;

public class PythagoreanTriple {
/** This program determines which numbers are pythagorean triples
 * April 20th, 2017 
 * @author 324032952 Sheila Noriega
 */
	public static void main(String[] args) {

		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				for ( int c = 0 ; c < 100; c++){
					if (pyNumbers(a, b, c)){

						System.out.println(a + " " + c + " " + b);
					}
				}

			}

		}


	}
	/**
	 * This method determines whether or not the number is a perfect square
	 * @param number
	 * @return
	 */
	public static boolean perfectSquare(int number) {

		int sqrt = (int) Math.sqrt(number);
		double checking = Math.pow(sqrt, 2);
		return sqrt == checking;


	}

	/**
	 * This method determines when 3 numbers form a pythagorean triple 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean pyNumbers(int a, int b, int c) {
		if (a == 0 || b == 0){
			return false;
		}
		int calc = (int) (Math.pow(a, 2) + (int) Math.pow(b, 2));

		if (calc == (int) Math.pow(c, 2)) {
			return true;

		} else {
			return false;
		}

	}







}
