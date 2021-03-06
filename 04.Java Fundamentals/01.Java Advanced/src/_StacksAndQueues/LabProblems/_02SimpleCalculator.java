package _StacksAndQueues.LabProblems;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tokens = scanner.nextLine().split("\\s+");
		
		ArrayDeque<String> calculator = new ArrayDeque<>();
		Collections.addAll(calculator, tokens);
		
		while (calculator.size() > 1) {
			Integer firstNum = Integer.valueOf(calculator.pop());
			String operator = calculator.pop();
			Integer secondNum = Integer.valueOf(calculator.pop());
			
			if (operator.equals("+")) {
				calculator.push(String.valueOf(firstNum + secondNum));
			} else {
				calculator.push(String.valueOf(firstNum - secondNum));
			}
		}
		
		System.out.println(calculator.pop());
	}
}
