package app;

import priya.util.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = new Console();
		console.println("Welcome to the Console Testing Application");
		console.println("*******************************************");
		console.println("Int Test");
		int num = console.getIntWithinRange("Enter an integer between -100 and 100: ",-100, 100);
		
		console.println("String Choice test: ");
		String choice = console.getChoiceString("Select One (x/y): ","x","y");
		console.println();

		console.println(num + choice);

	}

}
