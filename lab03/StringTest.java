import java.util.Scanner;

/** 
* @author Owen Perry 
* @version 1.0
*/

public class StringTest {

	public static void main (String args[]) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Input a string: ");
		String theString = reader.nextLine();
		System.out.println(theString);
		System.out.println(theString.length());
		System.out.println(theString.toUpperCase());
		System.out.println(theString.toLowerCase());
		System.out.println(theString.substring(0,1));
		System.out.println(theString.charAt(theString.length()-1));
		System.out.println(theString.replace(" ", ""));
	}
}