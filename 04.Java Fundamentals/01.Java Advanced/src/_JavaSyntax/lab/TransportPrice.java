package _JavaSyntax.lab;

import java.util.Scanner;

public class TransportPrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance = scanner.nextDouble();
		String dayOrNight = scanner.next();
		double priceForTravel = 0;
		
		if (distance >= 20) {
			priceForTravel = distance * 0.09;
		}
		else if (distance >= 100) {
			priceForTravel = distance * 0.06;
		}
		else {
			if (dayOrNight.equals("day")) {
				priceForTravel = (distance * 0.79) + 0.70;
			}
			else {
				priceForTravel = (distance * 0.90) + 0.70;
			}
		}
		
		System.out.printf("%.2f",priceForTravel);
	}
}
