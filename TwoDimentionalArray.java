package CorePractice;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of rows :- ");
		int rows = sc.nextInt();
		System.out.print("Enter size of column :- ");
		int column = sc.nextInt();

		int number[][] = new int[rows][column];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
	}
}