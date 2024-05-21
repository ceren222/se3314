import java.util.ArrayList;
import java.util.List;

/**
 * book in the library
 */
public class Book {

    /**
     * The title of the book
     * */
    private String title;

    /**
     * The author of the book
     * */
    private String author;

    /**
     * The ISBN of the book
     * */
    private String ISBN;

    /**
     * the book is in the library or not
     * */
    private boolean isAvailable;

    /**
     *
     * @param title   The title of the book.
     * @param author  The author of the book.
     * @param ISBN    The ISBN of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is available in the library.
     * @return True if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Updates the availability status of the book.
     * @param available True if the book is available, false otherwise.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

