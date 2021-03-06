package _StacksAndQueues.LabProblems;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _05HotPotato {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] children = scanner.nextLine().split("\\s+");
		int n = Integer.parseInt(scanner.nextLine());
		
		ArrayDeque<String> collect = new ArrayDeque<>();
		Collections.addAll(collect, children);
		
		while (collect.size() > 1) {
			for (int index = 1; index < n; index++) {
				String token = collect.poll();
				collect.offer(token);
			}
			System.out.println("Removed " + collect.poll());
		}
		
		System.out.println("Last is " + collect.poll());
		
	}
}
