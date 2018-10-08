public class LeapYear {
    public static void main (String args[]) {

      	int i = Integer.parseInt(args[0]);

		if (((i % 4) == 0) && (i % 100 != 0)){
			System.out.println("Leap year.");
		}	else if (((i % 400) == 0) && (i % 100 == 0)){
			System.out.println("Leap year.");
		}	else {
					System.out.println("Not a leap year.");
		}
	}
}