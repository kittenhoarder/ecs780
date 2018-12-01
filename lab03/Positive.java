/** 
* @author Owen Perry 
* @version 1.0
*/
import java.util.Scanner;

public class Positive {

	/** 
	*  This method reads a double from the user and performs different functions
	* 	whether that number is positive, negative, or not a number. 
	* @param dPos This is a double as read from the user.
	*/
	public static Double positive(Double dPos) {

		double dPosNum1 = dPos;
		double dPosNum2 = dPos;

			// First if for the 2nd number
			if (dPosNum1 > 0) {
				System.out.print("Input another number: ");
				Scanner reader = new Scanner(System.in);
				Double dPosNum2inp = Double.parseDouble(reader.nextLine());

				// Nexted if for case where 2nd number > 1st, to give range
				if (dPosNum2inp > dPosNum1) {
					double rangeBetween = dPosNum2inp - dPosNum1;
					return rangeBetween;
				} 
				// Nexted if for case where 1st number < absolute value of 2nd negative number
				if (dPosNum2inp < (dPosNum1 - (dPosNum1*2)) ) {
					double rangeBetween = dPosNum1 - dPosNum2inp;
					return rangeBetween;
				}
				// Nested if where 2nd num < 1st num and 2nd num negative
				if ( (dPosNum2inp < dPosNum1) && (dPosNum2inp < 0) ) {
					double rangeBetween = dPosNum2inp - dPosNum1;
					return Math.abs(rangeBetween);
				} else {
					double rangeBetween = dPosNum1 - Math.abs(dPosNum2inp);
					return rangeBetween;
				}
			}
			if (dPosNum1 <= 0) {
					dPosNum2 = Math.abs(dPosNum1);
					return dPosNum2;

			} else {
				double absoluteValue = Math.abs(dPos);
				return absoluteValue;
			}
	}

	public static void main (String args[]) {
		// Main program, where the number is input and fed into the class to perform the actions.
		System.out.print("Input a number: ");
		Scanner input = new Scanner(System.in);
		String dPosInp0 = input.nextLine();
		// Error checking upon input
		try {
			Double dPosInp = Double.parseDouble(dPosInp0);
			System.out.println(positive(dPosInp));
		} catch (NumberFormatException e) {
			System.out.println("Error! Please enter a number.");
		}
	}
}