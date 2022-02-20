 
// Author: Andrew Derbak
// Building from scratch

import java.util.Scanner; // Be able to accept user input

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		System.out.println("Welcome to MadLibs! Let's begin...\n");
		do {
			String color = "";
			String pastTenseVerb = "";
			String adjective = "";
			String noun = "";

			System.out.println("Name a color:");
			color = scan.next();

			System.out.println("Name a pasttense verb:");
			pastTenseVerb = scan.next();

			System.out.println("Name an adjective:");
			adjective = scan.next();

			System.out.println("Name a noun:");
			noun = scan.next();

			System.out.println("Here is your madlib:\n\n");
			System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
			System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
			
			System.out.println("Would you like to play again (y/n)?:");
			playAgain = scan.next();
		}  while (playAgain.equalsIgnoreCase("y"));
		System.out.println("\nThank you for playing! Goodbye.");
		scan.close();


	}

}
