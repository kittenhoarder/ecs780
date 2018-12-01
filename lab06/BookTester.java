	/**
* @author Owen Perry 
* @version 1.0
*/
public class BookTester {

	public static void main(String[] args) {

	Bookshelf newBookshelf = new Bookshelf();

	Book newTextBook1 = new TextBook("978-0596009205","Head First Java", "Kathy Sierra and Bert Bates","Oreilly Media" );
	Book newTextBook2 = new Novel("978-0-385-53785-8","Inferno","Dan Brown","English","Mystery");
	Book newTextBook3 = new ComicBook("978-2-86497-266-2","Asterix and the Picts","Jean-Yves Ferri, Rene Goscinny and Albert Uderzo","Didier Conrad");
	//Book newBook1 = new Book();

	newBookshelf.addBook(newTextBook1);
	newBookshelf.addBook(newTextBook2);
	newBookshelf.addBook(newTextBook3);
	newBookshelf.printBooks();
	

	//System.out.println(newTextBook3.toString());
	}
}