package _03Inheritance.HomeExercise._03Mankind;

public class Human {
	private String firstName;
	private String lastName;
	
	public Human(String firstName, String lastName) {
		this.setFirstname(firstName);
		this.setLastname(lastName);
	}
	
	private String getFirstname() {
		return firstName;
	}
	
	private void setFirstname(String firstName) {
		if(Character.isLowerCase(firstName.charAt(0))) {
			throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
		} else if (firstName.trim().length() < 4) {
			throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
		}
		this.firstName = firstName;
	}
	
	private String getLastname() {
		return lastName;
	}
	
	private void setLastname(String lastName) {
		if(Character.isLowerCase(lastName.charAt(0))) {
			throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
		} else if(lastName.trim().length() < 3) {
			throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
		}
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "First Name: " + this.getFirstname()
				+System.lineSeparator()
				+"Last Name: " + this.getLastname()
				+System.lineSeparator();
	}
	
}
