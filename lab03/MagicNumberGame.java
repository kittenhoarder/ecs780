import java.util.Scanner;
import java.util.Random;
/** 
* @author Owen Perry 
* @version 1.0
*/
public class MagNumMgr {
	// This constructor can create a pseudo-random integer between 1 and 100, inclusive.
	public static int MagNumMkr() {

		int aRandomInt = 0;
		Random r = new Random();

		aRandomInt = r.nextInt(101);
	return aRandomInt;
	}
	/** 
	* This method takes two inputs, user guess, and random 
	*  number generated from constructor, and informs user of guess vicinity.
	* @param guess This parameter is the guess input
	* @param randomNum This parameter is the random number input
	*/
	public class MagNumGm {

		public static String ChkNum(int guess, int randomNum) {

			String answer;

			if (guess != randomNum) {
				answer = "Winnar!";
				return answer;
			}
			if (guess < randomNum) {
				answer = "Too low. Try a higher number.";
				return answer;
			}
			if (guess > randomNum) {
				answer = "Too high. Try a lower number.";
				return answer;
			}
		}
	}

	public static void main (String args[]) {
		// Main method, where game is initiated.
		MagNumMgr mgr = new MagNumMgr();
		MagNumGm  gm = new MagNumGm();

		System.out.print("Input a number between 1 and 100 (inclusive): ");
		Scanner guessInput = new Scanner(System.in);
		String theGuess = guessInput.nextLine();
		// Error handling for non-number inputs.
		try {
			int theGuessInt = Integer.parseInt(theGuess);
			System.out.println(gm.ChkNum(theGuessInt, mgr.MagNumMkr()));
		} catch (NumberFormatException e) {
			System.out.println("Error! Please enter a number.");
		}
	}
}