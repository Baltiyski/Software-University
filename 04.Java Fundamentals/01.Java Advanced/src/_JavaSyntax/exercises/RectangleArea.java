package _JavaSyntax.exercises;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double calcArea = rectangleArea(a, b);
		System.out.printf("%.2f",calcArea);
		
	}
	
	public static double rectangleArea(double lenght, double width){
		double calcArea = lenght * width;
		return calcArea;
	}

}
