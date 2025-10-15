interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Car returned successfully.");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
}

class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}

public class MultiVehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        System.out.println("--- Renting Vehicles ---");
        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("\n--- Returning Vehicles ---");
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
