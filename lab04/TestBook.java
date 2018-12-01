/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.Scanner; //Allows us to use the Scanner class

public class TestBook {
	public static void main (String args[]) {

		Book myBook1 = new Book(); // Initializes a new book!
		Book myBook2 = new Book();

		myBook1.setTitle("Head First Java");
		myBook1.setAuthor("Kathy Sierra and Bert Bates");
		myBook1.setIsbn("0596009208");
		myBook1.rentBook();
		myBook1.returnBook();
		myBook1.rentBook();

		myBook2.setTitle("Java, How to program");
		myBook2.setAuthor("PJ Deitel and HM Deitel");
		myBook2.setIsbn("0132575663");
		myBook2.rentBook();
		myBook2.rentBook();

		Book[] books = new Book[5];
		books[0] = myBook1;
		books[1] = myBook2;

		System.out.println(books[1].toString());


		System.out.println(myBook1.toString());

	}
}
