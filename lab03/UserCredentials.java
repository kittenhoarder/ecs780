import java.util.Scanner;

/**
* This app basically allows the user to set and check a username and password.
* @author Owen Perry
* @version 1.0
*/

public class UserCredentials {

	private static String username, password;
	/**
	* This method sets the username.
	* @param uName
	*/
	public static void setUsername(String uName) {
		username = uName;
	}
	/**
	* This method sets the password.
	* @param pwd
	*/
	public static void setPassword(String pwd) {
		password = pwd;
	}
	/**
	* This method gets the username.
	*/
	public static String getUsername() {
		return username;
	}
	/**
	* This method gets the username.
	*/
	public static String getPassword() {
		return password;
	}
	/**
	* This method checks the credentials and returns boolean.
	*/
	public static boolean checkCredentials(String uName, String pwd) {
		if ((uName.equals(username) == true) && (pwd.equals(password) == true) ) {
			return true;
		} else {
			return false;
		}
	}

	public static void main (String args[]) {

		// Creating scanner obj

		Scanner reader = new Scanner(System.in);

		// Passing password and username to setter
		setUsername("user42");
		setPassword("pass42");

		// Used to print attempts left
		int attemptsLeft = 3;

		// do-while checks if there are attempts left
		do {
				System.out.print("Username: ");
				String usernameInput = reader.next();
				System.out.print("Password: ");
				String passwordInput = reader.next();
				if (checkCredentials(usernameInput, passwordInput) == true) { //outer username loop check
					System.out.println("Access granted!");
					System.exit(0);
				}
			 else { //after failed check pass, reduce attempts & error or exit
				attemptsLeft--;
				System.out.println("Wrong username or password, "+attemptsLeft+" attempts left." );
			}
		} while (attemptsLeft > 0);
			System.out.println("3 attempts made, exiting.");
			System.exit(0);
	}

}