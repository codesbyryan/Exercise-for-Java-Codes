import java.util.Scanner;

public class App {
	/**
	 * This is the main method of the App class.
	 * It prompts the user for their name, age, and favourite programming language,
	 * and then prints out a student profile with this information.
	 * Additionally, it checks if the user is an adult (over the age of 21),
	 * and suggests they put in more study hours if they are not already doing so.
	 * Finally, it prints out a motivational message to encourage the user to keep learning.
	 */
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.println("Welcome to MyStudent");
        
    	System.out.print("Full Name? ");
    	String name = input.nextLine();
 
        String firstName = name.substring(0, name.indexOf(" ")); // Extract the first name

    	System.out.print("Age? ");
    	int age = input.nextInt();
 
    	System.out.print("Tell us " + firstName + ", ");
    	input.nextLine(); // Consume the newline character
 
    	System.out.print("what is your favourite programming language? ");
    	String language = input.nextLine();
 
    	System.out.print("And how many hours do you study it per week? ");
    	double studyHours = input.nextDouble();
 
    	boolean isAdult = age >= 21;
 
    	greetStudent(firstName);
 
    	System.out.println("\n--- Student Profile ---");
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Favourite Programming Language: " + language);
    	System.out.println("Hours Per Week: " + studyHours);
    	System.out.println(firstName + " is " + (isAdult ? "an adult" : "not an adult"));
 
    	if (studyHours >= 7) {
        	System.out.println("Keep up the good work!");
    	} else {
        	System.out.println("Put in more hours sir!");
    	}
 
    	for (int i = 1; i <= 1; i++) {
        	System.out.println("Keep learning " + language + ", " + firstName + "! ");
    	}
	}
 
	public static void greetStudent(String name) {
    	System.out.println("Welcome, " + name + "!");
	}
}
