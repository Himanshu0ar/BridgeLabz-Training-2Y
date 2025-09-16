class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title, author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author; // using this
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Basics", "James");
        Book b2 = new Book("ISBN002", "Python Guide", "Guido");

        Book.displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}
