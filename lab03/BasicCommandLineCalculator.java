import java.util.Scanner;
/** 
* @author Owen Perry 
* @version 1.0
*/
public class BasicCommandLineCalculator {
	public static void main (String args[]) {
		// initiates a scanner object
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your operation: ");
		String str = reader.next();
		String x = str.substring(0, 2); //store x as 0 and 1 in string
		String op = str.substring(2, 3); //store op as place 2 in string
		String y = str.substring(3);  //store y as 3 and 4 in string

		int xInt = Integer.parseInt(x);
		int yInt = Integer.parseInt(y);

		long answer;
		double answerPow;

		//calculator functions as if statements
		if (op.equals("+")) {
			answer = xInt + yInt;
			System.out.println(x + " " + op + " " + y + " = " + (answer));
			System.exit(0);
		} 
		if (op.equals("-")) {
			answer = xInt - yInt;
			System.out.println(x + " " + op + " " + y + " = " + (answer));
			System.exit(0);
		}
		if (op.equals("*")) {
			answer = xInt * yInt;
			System.out.println(x + " " + op + " " + y + " = " + (answer));
			System.exit(0);
		} else {
			answerPow = Math.pow(xInt, yInt);
			System.out.println(x + " " + op + " " + y + " = " + (answerPow));
		}

	}
}