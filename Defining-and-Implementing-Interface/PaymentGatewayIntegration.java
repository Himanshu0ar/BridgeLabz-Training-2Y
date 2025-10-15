interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed successfully.");
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Paytm.");
    }
}

class GooglePay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Google Pay.");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        PaymentProcessor gpay = new GooglePay();

        paytm.processPayment(500);
        gpay.processPayment(1000);

        paytm.refund(200);
    }
}
