import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Fourth Wing", "Rebecca Yarros", "9783423284127");
        Library library = new Library();
        library.addBook(book1);



        System.out.println("Books by Rebecca Yarros:");
        List<Book> Books = library.searchBooks("Fourth Wing");
        printBooks(Books);

    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", ISBN: " + book.getISBN() + ", Available: " + book.isAvailable());
        }
        System.out.println();
    }
}
