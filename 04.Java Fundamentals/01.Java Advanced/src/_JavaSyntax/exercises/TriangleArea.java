package _JavaSyntax.exercises;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
        int aX, aY, bX, bY, cX, cY;

        Scanner scanIn = new Scanner(System.in);
        aX = scanIn.nextInt();
        aY = scanIn.nextInt();
        bX = scanIn.nextInt();
        bY = scanIn.nextInt();
        cX = scanIn.nextInt();
        cY = scanIn.nextInt();
        scanIn.close();

        double area = Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        System.out.println(Math.round(area));
	}
}
