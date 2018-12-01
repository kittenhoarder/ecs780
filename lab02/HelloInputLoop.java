public class HelloInputLoop {
	public static void main (String args[]) {
		
		int i = 0;

		while (i < args.length) {
		System.out.print("Hi ");
		System.out.println(args[i]+"!");
		i++;
		}
	}
}
