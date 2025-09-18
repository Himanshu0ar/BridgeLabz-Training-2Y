class Product {
    private static double discount = 10.0; // percentage
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            double finalPrice = price * quantity * (1 - discount / 100);
            System.out.println("ID: " + productID + ", Product: " + productName +
                               ", Qty: " + quantity + ", Final Price: " + finalPrice);
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000, 1);
        Product p2 = new Product(2, "Phone", 20000, 2);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(20);
        p1.displayDetails();
    }
}
