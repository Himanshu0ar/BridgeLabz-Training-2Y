public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private String registrationNumber;
    private static int totalVehicles = 0;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        totalVehicles++;
    }

    public void display() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", RegNo: " + registrationNumber);
    }

    public static void showTotalVehicles() {
        System.out.println("Total Registered Vehicles: " + totalVehicles);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "DL01AB1234");
        Vehicle v2 = new Vehicle("Neha", "Bike", "DL05XY7890");
        v1.display();
        v2.display();
        Vehicle.showTotalVehicles();
    }
}
