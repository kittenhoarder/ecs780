public class ArrayTest {

	public static void main(String[] args) {

		String[] strings =  new String[3];

		strings[0] = "Owen Perry";
		strings[1] = "Male";
		strings[2] = "owenperry@gmail.com";

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
}