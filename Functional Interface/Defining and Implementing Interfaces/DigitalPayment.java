interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}