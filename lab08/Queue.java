/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class Queue<T> {

	private ArrayList<T> t;

	public Queue(){
		t = new ArrayList<T>();
	}	

	public void enqueue(T i) {
		t.add(i);
	}

	public void dequeue() {
		t.remove(0);
	}

	public T head() {
		System.out.println(t.get(0));
		return t.get(0);
	}

	public T tail(){
		System.out.println(t.get(t.size()-1));
		return t.get(t.size()-1);
	}

}