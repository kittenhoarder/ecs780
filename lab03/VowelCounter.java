/* 
* @author Owen Perry 
* @version 1.0
*/
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.5</version>
</dependency>
import java.util.Scanner;

public class VowelCounter {

	public static void main (String args[]) {

		System.out.print("Write a sentence");
		Scanner sentenceInp = new Scanner(System.in);
		String sentenceInput = sentenceInp.nextLine();

		int a = StringUtils.countMatches(sentenceInput, "a");
		int e = StringUtils.countMatches(sentenceInput, "e");
		int i = StringUtils.countMatches(sentenceInput, "i");
		int o = StringUtils.countMatches(sentenceInput, "o");
		int u = StringUtils.countMatches(sentenceInput, "u");
		int aA = StringUtils.countMatches(sentenceInput, "A");
		int eE = StringUtils.countMatches(sentenceInput, "E");
		int iI = StringUtils.countMatches(sentenceInput, "I");
		int oO = StringUtils.countMatches(sentenceInput, "O");
		int uU = StringUtils.countMatches(sentenceInput, "U");

		System.out.println(a+e+i+o+u+aA+eE+iI+oO+uU);
	}
}