/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.Scanner; //Allows us to use the Scanner class
import java.util.ArrayList; //Allows us to use an array list

public class TestBookshelf {
	public static void main (String args[]) {

		Bookshelf newBookshelf1 = new Bookshelf();
		
		newBookshelf1.addBook("123456789", "Booktitle!!!", "John Smith");
		
		newBookshelf1.addBook("000000001", "Spooky Book III", "Headless Horseman");
		
		newBookshelf1.addBook("999999999", "A riveting novel", "Owen Perry");

		//newBookshelf1.printBooks();

		newBookshelf1.findBookWithIsbn("999999999");

		//newBookshelf1.findBookWithIsbn("828393889");

		Book x = new Book("1");

	}
}