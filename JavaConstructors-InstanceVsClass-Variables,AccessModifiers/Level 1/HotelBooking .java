public class HotelBooking {
    private String guestName;
    private String roomType; // e.g., "Standard", "Deluxe", "Suite"
    private int nights;

    // Default
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = Math.max(1, nights);
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    // simple cost calculation based on room type
    public double calculateTotalCost() {
        double ratePerNight;
        switch (roomType.toLowerCase()) {
            case "suite": ratePerNight = 5000; break;
            case "deluxe": ratePerNight = 3000; break;
            default: ratePerNight = 1500; // standard
        }
        return ratePerNight * nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName +
                           ", Room: " + roomType +
                           ", Nights: " + nights +
                           ", TotalCost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking(); // default
        HotelBooking h2 = new HotelBooking("Ravi", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2); // copy
        h1.display();
        h2.display();
        h3.display();
    }
}
