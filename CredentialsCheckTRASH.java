import java.util.Scanner;

public class CredentialsCheck {
	public static boolean checkCredentials(String str) {
		if (str == ) {
			return true;
		} else {
			return false;
		}
	}

	public static void main (String args[]) {
		int attemptsLeft = (i - 3); // used to print attempts left

		// Create a Scanner object
		Scanner reader = new Scanner(System.in);

		// Read username
		System.out.print("Username: ");
		String userInput = reader.next();
		for (int i;i != 2; i++) {
			if (checkCredentials(userInput) == true) {
				System.out.print("Password: ");
				String passInput = reader.next();
				if (checkCredentials(passInput) == true) {

				}
			} else {
				System.out.println("Wrong username or password, "+attemptsLeft+" attempts left." );
				if (attemptsLeft == 0) {
					System.out.println("3 attempts made, exiting.");
					System.exit(0);
				}
				System.exit(0);
			}
		}

		// Read password
		System.out.print("Enter your password: ");
		String email = reader.next();
		if (checkEmail(email) == true) {
			System.out.println("Your e-mail address is: " + email + ".");
		} else {
			System.out.println("Error, need an '@'' or '.'!");
			System.exit(0);
		}
	}
}