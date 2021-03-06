package _MatrixExercise;

import java.util.Scanner;

public class MaxSumOf2x2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(", ");
		int rowArr = Integer.parseInt(input[0]);
		int colArr = Integer.parseInt(input[1]);
		int[][] array = new int[rowArr][colArr];
		
		for (int row = 0; row <array.length; row++) {
			input = scanner.nextLine().split(", ");
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = Integer.parseInt(input[col]);
			}
		}
		
		int sum = 0;
		int solving = Integer.MIN_VALUE;
		int regRowOne = Integer.MIN_VALUE, regRowTwo = Integer.MIN_VALUE, regColOne = Integer.MIN_VALUE, regColTwo = Integer.MIN_VALUE;
		for (int i = 0; i < array.length -1; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				sum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i+1][j+1];
				if (solving < sum) {
					solving = sum;
					regRowOne = array[i][j];
					regRowTwo= array[i][j + 1];
					regColOne = array[i + 1][j];
					regColTwo = array[i+1][j+1];
				}
			}
		}
		
		System.out.printf("%s %s\n%s %s\n%s",regRowOne,regRowTwo,regColOne,regColTwo,solving);
	}
}
