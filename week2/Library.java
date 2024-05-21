import java.util.ArrayList;
import java.util.List;
/** List of books in the ibrary
 */
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
/** add book in the library */
    public void addBook(Book b) throws IllegalArgumentException {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(b);
    }
/** Search book in the library throws IllegalArgumentException If the book is null */

    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * @param book
     * @param borrower
     * @throws IllegalArgumentException
    /* check book in the library , throw new IllegalArgumentException if book cannot be checked out */
    public void checkOutBook(Book book, String borrower) throws IllegalArgumentException {
        if (book == null || !book.isAvailable()) {
            throw new IllegalArgumentException("Book cannot be checked out");
        }
        book.setAvailable(false);

    }
/* return book in the library */
    public void returnBook(Book book) throws IllegalArgumentException {
        if (book == null || book.isAvailable()) {
            throw new IllegalArgumentException("Invalid book return");
        }
        book.setAvailable(true);

    }
}

