/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class Stack<T> {

	private ArrayList<T> stackArray = new ArrayList<T>();

	public void add(T t) {
		stackArray.add(t);
	}
	public T pop() {
		//T returnVar = 
		return stackArray.get(stackArray.size()-1);
		stackArray.remove(stackArray.size()-1);
	}

	public static void main(String[] args) {
		Stack<String> stringStack = new Stack<String>();


	}
}