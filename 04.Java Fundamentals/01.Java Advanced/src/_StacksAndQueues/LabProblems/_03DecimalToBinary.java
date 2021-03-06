package _StacksAndQueues.LabProblems;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decimal = Integer.valueOf(scanner.nextLine());
		
		ArrayDeque<Integer> decimalToBinary = new ArrayDeque<>();
		
		if (decimal == 0) {
			System.out.println("0");
			return;
		}
		while (decimal != 0) {
			decimalToBinary.push(decimal % 2);
			decimal /= 2;
		}
		
		while (!decimalToBinary.isEmpty()) {
			System.out.print(decimalToBinary.pop());
		}
	}
}
