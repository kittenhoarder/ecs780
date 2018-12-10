/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class StackTest {
	public static void main(String[] args) {
		//Stack<String> stringStack = new Stack<String>();
		Stack<String> stringStack = new Stack<String>();

		//stringStack.push("one");
		stringStack.push("two");
		stringStack.pop();
		stringStack.push("three");
		stringStack.peak(); // should return three
		stringStack.size(); // should return 2
	}
}