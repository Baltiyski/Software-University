package _JavaSyntax.exercises;

import java.util.Scanner;

public class FirstOddOrEvenElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		String[] rule = scanner.nextLine().split(" ");
		
		int howManyNum = Integer.parseInt(rule[1]);
		String oddEven = rule[2];
		
		int counter = 0;
		if (oddEven.equals("even")) {
			for (int i = 0; i < numbers.length; i++) {
				int rend = Integer.parseInt(numbers[i]);
				if (rend % 2 == 0) {
					System.out.print(rend + " ");
					counter++;
				}
				if (counter >= howManyNum) {
					break;
				}
			}
		} else {
			for (int i = 0; i < numbers.length; i++) {
				int rend = Integer.parseInt(numbers[i]);
				if (rend % 2 != 0) {
					System.out.print(rend + " ");
					counter++;
				}
				if (counter >= howManyNum) {
					break;
				}
			}
		}
		
	}
}