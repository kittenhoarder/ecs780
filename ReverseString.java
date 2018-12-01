/* 
* Input: A string
* Output: String, reversed, sans punctuation,
*  digits, whitespace, and tabs, uppercase to
*  lower and lowercase to upper
* @author Owen Perry 
* @version 1.0
*/
import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {

		char ch[] = str.toCharArray();
		String rev = "";

		for (int i = ch.length-1; i >= 0; i--) {
			rev += ch[i];
		}

		return rev;
	}

	public static String reverseCase(String text) {
    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++)
    {
        char c = chars[i];
        if (Character.isUpperCase(c))
        {
            chars[i] = Character.toLowerCase(c);
        }
        else if (Character.isLowerCase(c))
        {
            chars[i] = Character.toUpperCase(c);
        }
    }
    return new String(chars);
	}

	public static void main (String args[]) {

		System.out.print("Input a string: ");
		Scanner reader = new Scanner(System.in);
		String theString = reader.nextLine();
		String theString1 = theString.replaceAll("[\\d\\s\\t\\p{Punct}]", "");					
		String theString2 = reverseCase(theString1);
		System.out.println(reverseString(theString2));

	}
}