package _SetsAndMaps.LabProblems;

import java.util.HashMap;
import java.util.Scanner;

public class _04CountSamValuesInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputNumbers = scanner.nextLine().split(" ");
		
		HashMap<String, Integer> numbers = new HashMap<>();
		
		for (int i = 0; i < inputNumbers.length; i++) {
			if (!numbers.containsKey(inputNumbers[i])) {
				numbers.put(inputNumbers[i], 1);
			} else {
				numbers.put(inputNumbers[i], numbers.get(inputNumbers[i]) + 1);
			}
		}
		
		for (String key : numbers.keySet()) {
			System.out.println(key + " - " + numbers.get(key) + " times");
		}
		
		
	}
}
