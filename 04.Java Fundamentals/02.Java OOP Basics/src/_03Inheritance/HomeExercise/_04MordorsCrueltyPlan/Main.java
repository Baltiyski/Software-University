package _03Inheritance.HomeExercise._04MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		Gandalf gandalf = new Gandalf();
		String[] inputFoods = read.readLine().split("\\s+");
		
		for (String food : inputFoods) {
			gandalf.eatFood(food);
		}
		
		gandalf.setMood();
		System.out.println(gandalf.getPoints());
		System.out.println(gandalf.getMood());
	}
}
