package _StacksAndQueues.HomeProblems;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03MaximumElemet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int commands = Integer.parseInt(scanner.nextLine());
		
		int maxElement = Integer.MIN_VALUE;
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		ArrayDeque<Integer> maxNumber = new ArrayDeque<>();
		
		for (int i = 0; i < commands; i++) {
			String[] input = scanner.nextLine().split("\\s+");
			String commandType = input[0];
			
			switch (commandType) {
			case "1":
				int number = Integer.parseInt(input[1]);
				stack.push(number);
				if (number >= maxElement) {
					maxElement = number;
					maxNumber.push(maxElement);
				}
				
				break;
				
			case "2":
				int currNum = stack.pop();
				if (currNum == maxElement) {
					maxNumber.pop();
					if (!maxNumber.isEmpty()){
                        maxElement = maxNumber.peek();
                    } else {
                        maxElement = Integer.MIN_VALUE;
                    }
				} 
				
				break;
				
			case "3":
				System.out.println(maxNumber.peek());
				break;
				
			default:
				break;
			}
		}
		
		
		
	}
}
