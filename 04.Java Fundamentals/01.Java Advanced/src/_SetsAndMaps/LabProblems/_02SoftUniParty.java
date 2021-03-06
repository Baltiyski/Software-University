package _SetsAndMaps.LabProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class _02SoftUniParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashSet<String> guestList = new HashSet<>();
		TreeSet<String> didntComeGuest = new TreeSet<>();
		
		while (true) {
			String guest = scanner.nextLine();
			if ("PARTY".equals(guest)) {
				break;
			} else {
				guestList.add(guest);
			}
		}
		
		while (true) {
			String comingGuests = scanner.nextLine();
			if ("END".equals(comingGuests)) {
				break;
			} else {
				guestList.remove(comingGuests);
			}
		}
		
		didntComeGuest.addAll(guestList);
		System.out.println(didntComeGuest.size());
		for (String guest : didntComeGuest) {
			System.out.println(guest);
		}
		
	}
}
