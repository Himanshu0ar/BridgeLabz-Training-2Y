interface VehicleDashboard {
    void displaySpeed();
    
    default void displayBatteryPercentage() {
        System.out.println("Battery feature not available for this vehicle");
    }
}

class PetrolCar implements VehicleDashboard {
    private int speed = 60;
    
    public void displaySpeed() {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    private int speed = 80;
    private int batteryPercentage = 75;
    
    public void displaySpeed() {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }
    
    public void displayBatteryPercentage() {
        System.out.println("Electric Car Battery: " + batteryPercentage + "%");
    }
}

class Bike implements VehicleDashboard {
    private int speed = 45;
    
    public void displaySpeed() {
        System.out.println("Bike Speed: " + speed + " km/h");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar();
        VehicleDashboard bike = new Bike();
        
        petrolCar.displaySpeed();
        petrolCar.displayBatteryPercentage();
        
        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
        
        bike.displaySpeed();
        bike.displayBatteryPercentage();
    }
}