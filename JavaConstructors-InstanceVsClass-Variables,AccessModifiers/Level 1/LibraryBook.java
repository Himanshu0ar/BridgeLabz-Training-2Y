public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // by default available
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true; // successfully borrowed
        } else {
            return false; // already borrowed
        }
    }

    public void returnBook() {
        available = true;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("1984", "George Orwell", 199.0);
        lb.display();
        boolean ok = lb.borrowBook();
        System.out.println("Borrowed? " + ok);
        lb.display();
        lb.returnBook();
        lb.display();
    }
}
