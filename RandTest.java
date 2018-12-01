import java.util.Random;

	public class RandTest {
		public static void main(String[] args){

		int aRandomInt = 1;
		Random r = new Random();

		while (aRandomInt == 1) {
			aRandomInt = r.nextInt(101);
		}

		System.out.println("A random int is " + aRandomInt);
	}
}