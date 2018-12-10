/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class QueueTest {
	public static void main(String[] args) {
		//Stack<String> queueStack = new Stack<String>();
		Queue<Integer> intQueue = new Queue<Integer>();
		Queue<String> stringQueue = new Queue<String>();
		//Testing string
		stringQueue.enqueue("one");
		stringQueue.enqueue("two");

		stringQueue.dequeue();

		stringQueue.enqueue("three");
		stringQueue.head(); // should return two
		stringQueue.tail(); // should return three

		//Testing integer
		intQueue.enqueue(1);
		intQueue.enqueue(2);

		intQueue.dequeue();

		intQueue.enqueue(3);
		intQueue.head(); // should return two
		intQueue.tail(); // should return three
	}
}