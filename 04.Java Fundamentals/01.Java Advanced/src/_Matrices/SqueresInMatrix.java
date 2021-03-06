package _Matrices;

import java.util.Scanner;

public class SqueresInMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arrRowCol = scanner.nextLine().split(" ");
		int arrRow = Integer.parseInt(arrRowCol[0]);
		int arrCol = Integer.parseInt(arrRowCol[1]);
		
		int[][] array = new int[arrRow][arrCol];
		
		fillMatrix(array, scanner);
		int result = squaresMatrix(array);
		System.out.println(result);
		
		
	}
	
	public static int squaresMatrix(int[][] matrix) {
		int equalMatrix = 0;
		
		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = 0; col < matrix[row].length - 1; col++) {
				if ((matrix[row][col] == matrix[row][col + 1]) && (matrix[row +1][col]==matrix[row+1][col+1]) && (matrix[row][col] == matrix[row+1][col])) {
					equalMatrix++;
				}
			}
		}
		
		return equalMatrix;
	}
	
	public static void fillMatrix(int[][] array, Scanner scanner) {
		for (int row = 0; row < array.length; row++) {
			String[] input = scanner.nextLine().split(" ");
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input[col].charAt(0);
			}
		}
		
	}
}
