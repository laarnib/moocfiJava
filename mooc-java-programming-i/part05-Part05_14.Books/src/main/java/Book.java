
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        // Check if the objects are in the same location
        if (this == compared) {
            return true;
        }
        
        // Check if compared is type of Book
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Typecast compared to Book
        Book bookCompared = (Book) compared;
        
        // Compare the values of this object to bookCompared
        if (this.name.equals(bookCompared.name) &&
            this.publicationYear == bookCompared.publicationYear) {
            return true;
        }
        
        return false;
    }

}
