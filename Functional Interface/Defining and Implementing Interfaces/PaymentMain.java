public class PaymentMain {
    public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();
        
        upi.pay(500.0);
        card.pay(1000.0);
        wallet.pay(250.0);
    }
}