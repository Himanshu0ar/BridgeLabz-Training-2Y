class Car implements Vehicle {
    public void rent() {
        System.out.println("Car is rented");
    }
    
    public void returnVehicle() {
        System.out.println("Car is returned");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike is rented");
    }
    
    public void returnVehicle() {
        System.out.println("Bike is returned");
    }
}

class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus is rented");
    }
    
    public void returnVehicle() {
        System.out.println("Bus is returned");
    }
}