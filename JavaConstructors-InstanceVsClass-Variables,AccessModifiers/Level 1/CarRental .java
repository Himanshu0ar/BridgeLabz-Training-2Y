public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = Math.max(1, rentalDays);
    }

    // Default constructor
    public CarRental() {
        this("Customer", "Economy", 1);
    }

    public double calculateTotalCost() {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv": rate = 3500; break;
            case "sedan": rate = 2500; break;
            case "premium": rate = 4500; break;
            default: rate = 1500; // economy
        }
        return rate * rentalDays;
    }

    public void display() {
        System.out.println("Customer: " + customerName +
                           ", Car: " + carModel +
                           ", Days: " + rentalDays +
                           ", Total: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Neha", "SUV", 4);
        CarRental r2 = new CarRental(); // default
        r1.display();
        r2.display();
    }
}
