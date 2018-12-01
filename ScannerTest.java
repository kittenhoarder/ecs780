import java.util.Scanner;

public class ScannerTest {
	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
		String secretWord = "secret";

		System.out.println("Try guess the secret word: ");

		while (sc.next().equals(secretWord)){
			
		} System.out.println("Wrong word. Try again: ");

	}
}