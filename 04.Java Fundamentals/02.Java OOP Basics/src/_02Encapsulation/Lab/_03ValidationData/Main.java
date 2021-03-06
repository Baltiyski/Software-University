package _02Encapsulation.Lab._03ValidationData;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfLines = Integer.parseInt(reader.readLine());

	    List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] input = reader.readLine().split("\\s+");
            try{
                people.add(new Person(input[0],input[1],Integer.parseInt(input[2]),Double.parseDouble(input[3])));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        int bonus = Integer.parseInt(reader.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
	}

}
