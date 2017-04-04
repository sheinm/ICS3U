package noriegaMestanza;
/** Is Divisible Program
 * This program finds out if a number is divisible by another number 
 * @author 324032952
 * April 3rd, 2017
 */
public class isDivisble {

	public static void main (String [] args){

	}
	// int or boolean???
	/**
	 * This method uses boolean features to determine whether or not one number is divisible or not by another
	 * @param a First number, will be divided by integer b
	 * @param b Second number, will divide a
	 * @return Returns whether or not integer a is divisible by integer b/
	 */
	public static boolean isDivisible (int a , int b) {
		if (a%b== 0) {
			return true;
		}
		return false;

	}


}
