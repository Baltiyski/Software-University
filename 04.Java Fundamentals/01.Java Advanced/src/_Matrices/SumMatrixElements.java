package _Matrices;

import java.util.Scanner;

public class SumMatrixElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(", ");
		int rowArr = Integer.parseInt(input[0]);
		int colArr = Integer.parseInt(input[1]);
		int[][] array = new int[rowArr][colArr];
		
		for (int row = 0; row <rowArr; row++) {
			input = scanner.nextLine().split(", ");
			for (int col = 0; col < colArr; col++) {
				array[row][col] = Integer.parseInt(input[col]);
			}
		}
		
		int sum = 0;
		for (int[] element : array) {
			for (int i : element) {
				sum += i;
			}
		}
		
		System.out.printf("%s\n%s\n%s",rowArr,colArr,sum);
		
	}
}
