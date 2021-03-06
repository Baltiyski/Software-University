package _Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class ReadSortPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int howManynames = Integer.parseInt(scanner.nextLine());
		String[] names = new String[howManynames];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.nextLine();
		}
		
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
