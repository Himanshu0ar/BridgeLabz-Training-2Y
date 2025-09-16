import java.util.Scanner;
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.booked = false;
        this.seatNumber = "";
    }

    public boolean bookTicket(String seat) {
        if (booked) {
            return false;
        } else {
            this.seatNumber = seat;
            this.booked = true;
            return true;
        }
    }

    public void displayTicket() {
        if (!booked) {
            System.out.println("Ticket not booked yet.");
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat : " + seatNumber);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        MovieTicket t = new MovieTicket(movie, price);
        System.out.print("Enter seat to book (e.g., A1): ");
        String seat = sc.nextLine();
        if (t.bookTicket(seat)) {
            System.out.println("Booking successful.\n");
        } else {
            System.out.println("Seat already booked.\n");
        }
        t.displayTicket();
        sc.close();
    }
}
