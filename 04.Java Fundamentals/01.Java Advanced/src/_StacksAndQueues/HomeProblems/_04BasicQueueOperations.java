package _StacksAndQueues.HomeProblems;
 import java.util.ArrayDeque;
/*
  * You will be given an integer N representing the number of elements to enqueue (add), 
  * an integer S representing the number of elements to dequeue (remove/poll) from the queue and finally an integer X, 
  * an element that you should check whether is present in the queue. If it is print true on the console, 
  * if it�s not print the smallest element currently present in the queue.
  */
import java.util.Scanner;

public class _04BasicQueueOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split("\\s+");
		
		int numbersToAdd = Integer.parseInt(input[0]);
		int removeNumbers = Integer.parseInt(input[1]);
		int elementInQueue = Integer.parseInt(input[2]);
		
		String[] numbers = scanner.nextLine().split("\\s+");
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		for (int i = 0; i < numbersToAdd; i++) {
			queue.add(Integer.parseInt(numbers[i]));
		}
		
		for (int i = 0; i < removeNumbers; i++) {
			queue.poll();
		}
		
		if (queue.isEmpty()) {
			System.out.println("0");
		} else if (queue.contains(elementInQueue)) {
			System.out.println("true");
		} else {
			int minNum = Integer.MAX_VALUE;	
			
			for (Integer number : queue) {
				if (number < minNum) {
					minNum = number;
				}
			}
			System.out.println(minNum);
		}
		
		
		
	}
}
