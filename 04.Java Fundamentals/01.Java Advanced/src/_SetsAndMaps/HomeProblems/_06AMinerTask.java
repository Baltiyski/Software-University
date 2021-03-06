package _SetsAndMaps.HomeProblems;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _06AMinerTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		LinkedHashMap<String, Integer> safe = new LinkedHashMap<>();
		
		while(true) {
			String miner = scanner.nextLine();
			if ("stop".equals(miner)) {
				break;
			}
			int amount = Integer.parseInt(scanner.nextLine());
			if (!safe.containsKey(miner)) {
				safe.put(miner, amount);
			} else {
				safe.put(miner, safe.get(miner) + amount);
			}
		}
		
		for (String miner : safe.keySet()) {
			System.out.println(miner + " -> " + safe.get(miner));
		}
		
	}
}
