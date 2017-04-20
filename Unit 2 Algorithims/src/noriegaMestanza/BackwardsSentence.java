package noriegaMestanza;

import java.util.Scanner;

public class BackwardsSentence {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a sentence.");
		sentenceBack();

	}

	public static void sentenceBack() {

		String[] sentence = sc.nextLine().split(" ");

		for (int i = 0; i < sentence.length; i++) {
			String period = " ";

			if (sentence[i].contains(".")) {
				period = ".";

			}
			for (int j = sentence[i].length() - 1; j >= 0; j--) {
				System.out.print(sentence[i].charAt(j));

			}
			System.out.print(" ");
		}

	}
}
// make the first letter capital
// period
// use multiple sentences