import java.util.Scanner;

public class BasicCommandLineCalculatorTest {
	public static void main (String args[]) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your operation: ");
		String str = reader.next();
		String x = str.substring(0, 2); //store x as 0 and 1 in string
		String op = str.substring(2, 3); //store op as place 2 in string
		String y = str.substring(3);  //store y as 3 and 4 in string

		int xInt = Integer.parseInt(x);
		int yInt = Integer.parseInt(y);


		System.out.println(op);
		/*
		if (op == "+") {
			System.out.println(x + " " + op + " " + y + " = " + (xInt + yInt));
		} 
		if (op == "-") {
			System.out.println(x + " " + op + " " + y + " = " + (xInt - yInt));
		}
		if (op == "*") {
			System.out.println(x + " " + op + " " + y + " = " + (xInt * yInt));
		} else {
			System.out.println(x + " " + op + " " + y + " = " + (Math.pow(xInt, yInt)));
		}
		*/
	}
}