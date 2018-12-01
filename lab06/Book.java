public abstract class Book {
    
    public String title, author, description;
    private final String isbn;
    private boolean rented = false;

    public abstract String printAllDetails();

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void rentBook() {
        if (rented == true) {
            System.out.println("The book "+title+" by "+author+" is not available.");
        } else {
            rented = true;
        }
    }

    public void returnBook() {
        rented = false;
    }

    public void setTitle(String titleS) {
        title = titleS;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String authorS) {
        author = authorS;
    }
    public String getAuthor() {
        return author;
    }
    //public void setIsbn(String isbnS) {
    //    isbn = isbnS;
    //}

    public String getIsbn() {
        return isbn;
    }
    public void setDescription(String descriptionS) {
        description = descriptionS;
    }
    public String getDescription() {
        return description;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printIsbn() {
        System.out.println("ISBN: " + isbn);
    }

    public void printDescription() {
        System.out.println("Description: " + description);
    }

    public String toString() {
        return (" '" + title + "' by " + author);
    }
}