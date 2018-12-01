/**
* @author Owen Perry 
* @version 1.0
*/
public class ComicBook extends Book {

	private String illustrator;

	public ComicBook(String isbn, String title, String author, String illustrator) {
		super(isbn, title, author);
		this.illustrator = illustrator;
	}

	public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }
    public String getillustrator() {
        return illustrator;
    }

    public String toString() {
        return (" '" + title + "' by " + author + " ,illustrated by "+ illustrator + ".");
    }

	public String printAllDetails() {
    	return (" '" + title + "' by " + author + " ,illustrated by "+ illustrator + ".");
    }
}