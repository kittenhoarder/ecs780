public class RangeCounter {
	public static void main (String[] args){
	
		int min = Integer.parseInt(args[0]); 
		int max = Integer.parseInt(args[1]);
		int sum = min;
		
		if (max > min) {
				sum = (max-min+1)*(min+max)/2;
				System.out.println(sum);
		} 	else {
			System.out.println("Error! 2nd input < 1st.");
			}
	}
}