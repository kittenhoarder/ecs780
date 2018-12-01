import java.util.Scanner;

/** 
* @author Owen Perry 
* @version 1.0
*/

public class HelloScanner {
	/**
	* This method checks the length of the input and returns true or false
	*/
	public static boolean checkLength(String str) {
		if (str.length() > 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkEmail(String str) {
		//if @ and . don't exist then returns false
		if ((str.indexOf('@') != -1) && (str.indexOf('.') != -1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main (String args[]) {

		// Create a Scanner object
		Scanner reader = new Scanner(System.in);

		// Read First name and check with length method above to see if greater than 3 char
		System.out.print("Enter your first name: ");
		String first = reader.next();
		if (checkLength(first) == true) {
			System.out.println("Hi " + first + "!");
		} else {
			System.out.println("Error, need more than 3 chars!");
			System.exit(0);
		}

		// Read Last name
		System.out.print("Enter your last name: ");
		String last = reader.next();


		// Read e-mail and checking with method that both @ and . exist
		System.out.print("Enter your e-mail: ");
		String email = reader.next();
		if (checkEmail(email) == true) {
			System.out.println("Your e-mail address is: " + email + ".");
		} else {
			System.out.println("Error, need an '@'' or '.'!");
			System.exit(0);
		}
	}
}