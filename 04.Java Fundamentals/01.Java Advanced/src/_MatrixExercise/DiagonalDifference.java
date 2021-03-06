package _MatrixExercise;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lenghtArr = Integer.parseInt(scanner.nextLine());
		int[][] array = new int[lenghtArr][lenghtArr];
		
		for (int  row= 0;  row< array.length; row++) {
			String[] input = scanner.nextLine().split(" ");
			for (int col = 0; col < array.length; col++) {
				array[row][col] = Integer.parseInt(input[col]);
			}
		}
		
		int sumUpToRigntBot = 0;
		int sumUpToLeftBot = 0;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			sumUpToRigntBot += array[i][i];
		}
		for (int i = array.length -1; i >= 0; --i) {
			sumUpToLeftBot += array[index][i];
			index++;
		}
		
		int result = Math.abs(sumUpToRigntBot - sumUpToLeftBot);
		System.out.println(result);
	}
}
