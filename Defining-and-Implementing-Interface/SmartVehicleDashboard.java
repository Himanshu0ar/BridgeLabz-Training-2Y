interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery information not available for non-electric vehicles.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
