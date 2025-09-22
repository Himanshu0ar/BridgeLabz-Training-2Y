import java.util.*;

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String n, double p, int q) {
        this.itemName = n;
        this.price = p;
        this.quantity = q;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + " | Qty: " + quantity + " | Price: " + price);
    }
}

// Interface
interface Discountable {
    double applyDiscount(double percent);
    String getDiscountDetails();
}

// Veg Item
class VegItem extends FoodItem implements Discountable {
    public VegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount(double percent) {
        return calculateTotalPrice() * (1 - percent/100);
    }
    public String getDiscountDetails() { return "Discount applied on Veg Item"; }
}

// Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { 
        return (getPrice() * getQuantity()) + 50; // extra non-veg charge
    }
    public double applyDiscount(double percent) {
        return calculateTotalPrice() * (1 - percent/100);
    }
    public String getDiscountDetails() { return "Discount applied on Non-Veg Item"; }
}

// Main Class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> order = new ArrayList<>();

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Food Item " + (i+1));
            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price per Item: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Type (1=Veg, 2=Non-Veg): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                order.add(new VegItem(name, price, qty));
            } else {
                order.add(new NonVegItem(name, price, qty));
            }
        }

        System.out.print("\nEnter discount percentage to apply: ");
        double discountPercent = sc.nextDouble();

        System.out.println("\n---- Order Summary ----");
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double finalPrice;

            if (item instanceof Discountable) {
                finalPrice = ((Discountable)item).applyDiscount(discountPercent);
                System.out.println(((Discountable)item).getDiscountDetails());
            } else {
                finalPrice = total;
            }

            System.out.println("Original Total: " + total);
            System.out.println("Final Price after Discount: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}
