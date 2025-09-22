import java.util.*;

// Abstract Class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String t, String a) {
        this.itemId = id;
        this.title = t;
        this.author = a;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

// Interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Book Class
class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { reserved = true; }
    public boolean checkAvailability() { return !reserved; }
}

// Magazine Class
class Magazine extends LibraryItem implements Reservable {
    private boolean reserved = false;
    public Magazine(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 7; }
    public void reserveItem() { reserved = true; }
    public boolean checkAvailability() { return !reserved; }
}

// DVD Class
class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;
    public DVD(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 3; }
    public void reserveItem() { reserved = true; }
    public boolean checkAvailability() { return !reserved; }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LibraryItem> items = new ArrayList<>();

        System.out.print("Enter number of library items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Item " + (i+1));
            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Type (1=Book, 2=Magazine, 3=DVD): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                items.add(new Book(id, title, author));
            } else if (type == 2) {
                items.add(new Magazine(id, title, author));
            } else {
                items.add(new DVD(id, title, author));
            }
        }

        System.out.println("\n---- Library Items ----");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available? " + (r.checkAvailability() ? "Yes" : "No"));

            System.out.print("Do you want to reserve this item? (yes/no): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                r.reserveItem();
                System.out.println("Item reserved successfully!");
            }

            System.out.println("Available after reservation? " + (r.checkAvailability() ? "Yes" : "No"));
            System.out.println("----------------------------");
        }
    }
}
