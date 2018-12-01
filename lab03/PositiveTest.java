/* 
* Input: A double
* Output: Double, reversed, sans punctuation,
*  digits, whitespace, and tabs, uppercase to
*  lower and lowercase to upper
* @author Owen Perry 
* @version 1.0
*/
import java.util.Scanner;

public class PositiveTest {

	public static Double positive(Double dPos) {
	
		//double dPosInp1;
		//double dPosInp2;

		switch(dPos) {
		     	case dPos >= 0:		System.out.print("Input a double: ");
									break;
						default:	System.out.print("Input a 111: ");
									break;
		}
	}
	public static void main (String args[]) {
		System.out.print("Input a double: ");
		Scanner input = new Scanner(System.in);
		double dPosInp1 = reader.nextLine();
		double dPosOut = positive(dPosInp1);
	}

}