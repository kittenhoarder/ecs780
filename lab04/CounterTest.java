/** 
* @author Owen Perry 
* @version 1.0
*/
public class CounterTest {
	public static void main(String[] args) {

		Counter counter1 = new Counter();

		counter1.setMax(10);
		counter1.setCount(2);

		System.out.println(counter1.getMax());
		System.out.println(counter1.getCount());
		//counter1.decreaseCount(10);
		counter1.increaseCount();
		System.out.println(counter1.getCount());

		/*
		counter1.decreaseCount();
		System.out.println(counter1.getCount());
		counter1.decreaseCount();
		System.out.println(counter1.getCount());

		
		System.out.println(counter1.getMax());
		System.out.println(counter1.getCount());
		counter1.increaseCount();
		System.out.println(counter1.getCount());
		counter1.decreaseCount();
		System.out.println(counter1.getCount());
		counter1.resetCount();
		System.out.println(counter1.getCount());
		System.out.println(counter1.toString());

		*/
	}
}