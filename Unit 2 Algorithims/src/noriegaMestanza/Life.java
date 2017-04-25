package noriegaMestanza;

import java.util.Scanner;

public class Life {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please enter a coordinate between 0,0 & 20,20 and press the space bar before typing the next coordinate");
		boolean[][] arr = new boolean[20][20];

	do {
		int row = sc.nextInt();
		int column = sc.nextInt();

		

	
		arr[row][column] = true;
			
		
	} 
		while (!sc.nextLine().equals(null)); 
	}

	public static boolean life(int x, int o) {
		boolean[][] arr = new boolean[20][20];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
