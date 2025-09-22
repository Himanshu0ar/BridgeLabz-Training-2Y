import java.util.*;

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car Class
class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Car Insurance: Flat 2000"; }
}

// Bike Class
class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Bike Insurance: Flat 500"; }
}

// Truck Class
class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Truck Insurance: Flat 5000"; }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1));
            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();
            System.out.print("Enter Rental Rate per Day: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Type (1=Car, 2=Bike, 3=Truck): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                vehicles.add(new Car(number, rate));
            } else if (type == 2) {
                vehicles.add(new Bike(number, rate));
            } else {
                vehicles.add(new Truck(number, rate));
            }
        }

        System.out.print("\nEnter number of days for rental: ");
        int days = sc.nextInt();

        System.out.println("\n---- Rental Details ----");
        for (Vehicle v : vehicles) {
            double rent = v.calculateRentalCost(days);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println("\nVehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental for " + days + " days: " + rent);
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println("Total Cost: " + (rent + insurance));
        }
    }
}
