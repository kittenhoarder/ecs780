/**
* @author Owen Perry 
* @version 1.0
*/
import java.util.ArrayList; //Allows us to use an array list

public class Bookshelf {

	public ArrayList<Book> bookshelf = new ArrayList<Book>();
	private int bookshelfSizeDefault = 10;

	public void bookshelfSizeSetter(int bookshelfSize) {
		bookshelfSizeDefault = bookshelfSize;
	}

	public void printBooks(){
		for (int i = 0; i < bookshelf.size(); i++) {
		System.out.println(bookshelf.get(i).printAllDetails());
		}
	}

	public void addBook(Book book) {
		if (bookshelf.size() < bookshelfSizeDefault) {
				bookshelf.add(book);
				System.out.println("New book added at " +bookshelf.size());
		} else {
			System.out.println("Error, bookshelf full!");
		}
	}

	public Book findBookWithIsbn(String isbn) {
		//System.out.println(bookshelf); //testing
		for (int z = 0; z < bookshelf.size(); z++) {
			//System.out.println(isbn); //testing
			//System.out.println(bookshelf.get(z).getIsbn()); //testing
			if (isbn.equals(bookshelf.get(z).getIsbn())) {
				System.out.println(bookshelf.get(z).getTitle());
				return bookshelf.get(z);			}
		}
		return null;
	}
}