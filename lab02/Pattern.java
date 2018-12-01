public class Pattern {
	public static void main (String[] args){

		int a = Integer.parseInt(args[0]);
	/*
		int i = Integer.parseInt(args[0]);  
		String theString = "";
		int d = 0;
		int c = 1;

		while (c <= i) {
			while (c <= i) {
				d++;
				int q = d;
				Integer.toString(q);
				theString = theString + q;
				System.out.println(theString);
				c++;
			}
		}
	*/
		 for (int i = 1; i <= a; i++) {
		            for (int k = 1; k <= i; k++) {
		                System.out.print(k);
		            }
		            System.out.println();
        }
	}
}



