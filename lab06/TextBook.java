/**
* @author Owen Perry 
* @version 1.0
*/
public class TextBook extends Book {

	private String publisher;

	public TextBook(String isbn, String title, String author, String publisher){
		super(isbn, title, author);
		this.publisher = publisher;
	}

	public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    public String toString() {
        return (" '" + title + "' by " + author + " ,published by "+ publisher + ".");
    }

 	public String printAllDetails() {
    	return (" '" + title + "' by " + author + " ,published by "+ publisher + ".");
    }
}