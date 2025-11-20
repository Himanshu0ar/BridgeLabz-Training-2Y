interface PaymentProcessor {
    void processPayment(double amount);
    
    default void refund(double amount) {
        System.out.println("Processing refund of $" + amount);
        System.out.println("Refund completed successfully");
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}

class RazorpayProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment of $" + amount);
    }
    
    public void refund(double amount) {
        System.out.println("Processing Razorpay refund of $" + amount + " with special handling");
    }
}

public class PaymentGatewayMain {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalProcessor();
        PaymentProcessor stripe = new StripeProcessor();
        PaymentProcessor razorpay = new RazorpayProcessor();
        
        paypal.processPayment(100.0);
        paypal.refund(50.0);
        
        stripe.processPayment(200.0);
        stripe.refund(75.0);
        
        razorpay.processPayment(300.0);
        razorpay.refund(100.0);
    }
}