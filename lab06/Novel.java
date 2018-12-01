/**
* @author Owen Perry 
* @version 1.0
*/
public class Novel extends Book {

	private String language;
	private String genre;

	public Novel(String isbn, String title, String author, String language, String genre){
		super(isbn, title, author);
		this.language = language;
		this.genre = genre;
	}

	public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public String toString() {
        return (" '" + title + "' by " + author + " ,a " + genre + " novel.");
    }

 	public String printAllDetails() {
    	return (" '" + title + "' by " + author + " ,a " + genre + " novel.");
    }
}