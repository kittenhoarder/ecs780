/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class Stack<T> {

	private ArrayList<T> t;

	public Stack(){
		t = new ArrayList<T>();
	}

	public void push(T i) {
		t.add(i);
	}

	public T pop() {
		T returnVar = t.get(t.size()-1);
		t.remove(t.size()-1);
		return returnVar;
	}

	public T peak() {
		System.out.println(t.get(t.size()-1));
		return t.get(t.size()-1);
	}

	public int size(){
		return t.size();
	}

}