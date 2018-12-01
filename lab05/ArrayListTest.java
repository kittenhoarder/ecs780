/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> strings =  new ArrayList<String>();

		strings.add("Owen Perry");
		strings.add("Male");
		strings.add("owenperry@gmail.com");

		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}	
}