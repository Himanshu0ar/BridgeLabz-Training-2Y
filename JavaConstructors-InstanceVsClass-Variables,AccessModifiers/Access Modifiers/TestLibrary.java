class LibraryBook {
    private String title;
    protected String author;
    int year;
    public boolean available;

    public LibraryBook(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }
}

class BorrowedBook extends LibraryBook {
    public BorrowedBook(String title, String author, int year, boolean available) {
        super(title, author, year, available);
    }

    public void showDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Available: " + available);
    }
}

public class TestLibrary {
    public static void main(String[] args) {
        BorrowedBook b = new BorrowedBook("1984", "George Orwell", 1949, true);
        b.showDetails();
    }
}
