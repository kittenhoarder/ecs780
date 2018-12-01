import java.util.Scanner;
import java.util.Random;
/** 
* @author Owen Perry 
* @version 1.0
*/
public class MagNumGm {

	public static void main (String args[]) {
		int newGame = 1; 
		do {
			newGame = 0;
			Random r = new Random(); //initiaize new Random object
			int rInt = r.nextInt(101); //set rInt to random number
			MagicNumber magNum = new MagicNumber(); //initialize new MagicNumber object
			int counter = 0; //counter for outputting guesses at end of game

			System.out.print("Guess the number between 1 and 100 (inclusive): "); //first guess
			Scanner guessInput = new Scanner(System.in);
			String theGuess = guessInput.nextLine();

			int theGuessInt = Integer.parseInt(theGuess); //convert guess string to int

			String magNumOutput = magNum.ChkNum(theGuessInt, rInt); //passes guess and prand num to ChkNum class
			System.out.println(magNumOutput);
			counter++;
			
			while (magNumOutput != "Winnar!") { //while loop for further guesses
			System.out.print("Guess again: ");
			theGuess = guessInput.nextLine();

			theGuessInt = Integer.parseInt(theGuess);

			magNumOutput = magNum.ChkNum(theGuessInt, rInt);
			System.out.println(magNumOutput);
			counter++;
			}
			System.out.println("You took " + counter + " guesses.");

			System.out.println("Want to try again? y/n"); // prompts the user if they want to try again
			Scanner tryAgain = new Scanner(System.in);
			String yesOrNo = guessInput.nextLine();
			if (yesOrNo.equals("y")) {
				newGame = 1;
			}
		} while (newGame == 1);
	}
}