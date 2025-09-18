class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName, vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("RegNo: " + registrationNumber + ", Owner: " + ownerName +
                               ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32 AB1234", "Ravi", "Car");
        Vehicle v2 = new Vehicle("DL10 XY5678", "Anita", "Bike");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(700);
        v1.displayDetails();
    }
}
