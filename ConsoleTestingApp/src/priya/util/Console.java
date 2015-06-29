package priya.util;

import java.util.Scanner;

/**The Console Class represents a console and is used by programs to work with input and output
 *functions of the class
 * @version 1.0.0
 * @author priya
 *
 */
public class Console {
	Scanner sc = new Scanner(System.in);

	/**Method outputs a line with the String s on to the console
	 * without a trailing new line
	 * @param s
	 */
	public void print(String s) {
		System.out.print(s);
	}
	
	/**Method outputs a line with the String s on to the console
	 * with a trailing new line
	 * @param s
	 */
	public void println(String s) {
		System.out.println(s);
	}
	/**Outputs an empty line to the Console
	 * 
	 */
	public void println() {
		System.out.println();
	}

	/**Gets user entered string and returns it
	 * validates that it is not null
	 * @param prompt
	 * @return String
	 */
	public String getRequiredString(String prompt) {
		String reqString = "";
		boolean isValid = false;

		do {
			System.out.println(prompt);
			if (sc.hasNext()) {
				reqString = sc.next();
				isValid = true;
			} else {
				System.out.println("No input found??");
			}
		} while (isValid == false);

		return reqString;

	}
	/**Validates that the user entered string is either s1 or s2
	 * and returns the value
	 * @param prompt
	 * @param s1
	 * @param s2
	 * @return String
	 */
	public String getChoiceString(String prompt, String s1, String s2) {
		String choiceString = "";
		boolean isValid = false;
		do {
			choiceString = getRequiredString(prompt);
			if (!choiceString.equalsIgnoreCase(s1)
					&& (!choiceString.equalsIgnoreCase(s2))) {
				System.out.println("Error: Entry must be "+s1+"or "+s2);
			} else {
				isValid = true;
			}
		} while (isValid == false);
		return choiceString;
	}
	/**Validates that the user has entered a valid number
	 * and saves the number and returns it
	 * @param prompt
	 * @return integer
	 */
	public int getInt(String prompt) {
		int num = 0;
		boolean isValid = false;

		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid Number:Try Again");
				sc.nextLine();
			}
		}
		sc.nextLine();
		return num;
	}
	/**Validates that the user has entered a valid number between min and max
	 * and saves the number and returns it
	 * @param prompt
	 * @return integer
	 */
	public int getIntWithinRange(String prompt, int min, int max) {
		int num = 0;
		boolean isValid = false;
		num = getInt(prompt);
		while (isValid == false) {
			if (num < min) {
				System.out.printf("Error: number must be greater than %d \n",
						min - 1);
				num = getInt(prompt);
			} else if (num > max) {
				System.out.printf("Error: number must be less than %d \n",
						max + 1);
				num = getInt(prompt);
			} else {
				isValid = true;
			}
		}
		return num;
	}
	/**Validates that the user has entered a valid double
	 * and saves the double and returns it
	 * @param prompt
	 * @return double
	 */
	public double getDouble(String prompt) {
		double num = 0;
		boolean isValid = false;

		do {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid Double :");
				sc.nextLine();
			}
		} while (isValid == false);
		sc.nextLine();
		return num;
	}
	/**Validates that the user has entered a valid double between min and max
	 * and saves the double and returns it
	 * @param prompt
	 * @return double
	 */
	public double getDoubleWithinRange(String prompt, double min, double max) {
		double num = 0;
		boolean isValid = false;

		do {
			num = getDouble(prompt);
			if (num < min) {
				System.out.printf("Error: number must be greater than %f \n",
						min - 1);
			} else if (num > max) {
				System.out.printf("Error: number must be less than %f \n",
						max + 1);
			} else {
				isValid = true;
			}
		} while (isValid == false);
		return num;
	}

}
