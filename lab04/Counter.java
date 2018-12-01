/**
* @author Owen Perry 
* @version 1.0
*/
public class Counter {
	
	private int count = 0;
	private int max = 10;
	/** 
	* @param setCountParam Setter input for the counter.
	*/
	public void setCount(int setCountParam) {
		count = setCountParam;
	}
	/** 
	* @param setCountParam Setter input for the max var.
	*/
	public void setMax(int setMaxParam) {
		max = setMaxParam;
	} 
	// Getter for count var.
	public int getCount(){
		return count;
	}
 
	//. Getter for max var.

	public int getMax(){
		return max;
	}
	// Increases count by 1, except when count is >= max, then it resets count to 0
	public void increaseCount() {
		count++;
		if (count >= max) {
			count = 0;
		}
	}
	// Decreases count by 1, except when its 0 or less, then it does nothing
	public void decreaseCount() {
		int countTracker = count;
		count--;
		if (count <= 0) {
			count = countTracker;
		}
	}
	// Increases count by input amount, except 
	//  when change cuases count to be >= max, then it 
	//  resets count to 0
	public void increaseCount(int incInp) {
		while (incInp != 0) {
			count++;
			incInp--;
		}
		if (count >= max) {
			count = 0;
		}
	}
	// Decreases count by input amount, except 
	//  when its 0 or less, then it does nothing
	public void decreaseCount(int decInp) {
		int countTracker = count;
		while (decInp != 0) {
			count--;
			decInp--;
		}
		if (count <= 0) {
			count = countTracker;
			}
	}
	//Resets count to 0
	public String resetCount() {
		count = 0;
		System.out.println("Counter Reset!");
		return "";
	}
	// Prints count and max as strings
	public String toString() {
		String countStr = Integer.toString(count);
		String maxStr = Integer.toString(max);
		return (countStr + " " + maxStr);
	}

}