/* 
* Takes two inputs, one guess and a psudeorandom number.
* Checks guess against the prand and outputs hi/lo/correct.
* @author Owen Perry 
* @version 1.0
*/
public class MagicNumber {

	public String ChkNum(int guess, int randomNum) {

		String answer;

		if (guess == randomNum) {
			answer = "Winnar!";
			return answer;
		}
		if (guess < randomNum) {
			answer = "Too low. Try a higher number.";
			return answer;
		} else {
			answer = "Too high. Try a lower number.";
			return answer;
		}
	}

	public static void main(String[] args) {}
}