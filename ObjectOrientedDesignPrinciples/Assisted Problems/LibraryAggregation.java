import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        // Books can exist independently
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("C++ Basics", "Bjarne Stroustrup");
        Book b3 = new Book("Python 101", "Guido van Rossum");

        // Libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showLibraryBooks();
        System.out.println("--------------");
        lib2.showLibraryBooks();
    }
}
