import java.util.*;

// Abstract Class
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }
}

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Car
class Car extends Vehicle implements GPS {
    private String location;

    public Car(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm(); }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

// Bike
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm(); }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

// Auto
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(int id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm() + 20; } // base fare
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

// Main Class
public class RideHailingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> rides = new ArrayList<>();

        System.out.print("Enter number of rides: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Ride " + (i+1));
            System.out.print("Enter Vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Driver Name: ");
            String driver = sc.nextLine();
            System.out.print("Enter Rate per Km: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Vehicle Type (1=Car, 2=Bike, 3=Auto): ");
            int type = sc.nextInt();
            sc.nextLine();

            Vehicle v;
            if (type == 1) {
                v = new Car(id, driver, rate);
            } else if (type == 2) {
                v = new Bike(id, driver, rate);
            } else {
                v = new Auto(id, driver, rate);
            }

            System.out.print("Enter Current Location: ");
            String loc = sc.nextLine();
            ((GPS)v).updateLocation(loc);

            rides.add(v);
        }

        System.out.print("\nEnter travel distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("\n---- Ride Summary ----");
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Location: " + ((GPS)v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println("----------------------------");
        }
    }
}
