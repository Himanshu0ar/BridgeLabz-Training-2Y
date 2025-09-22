import java.util.*;

// Abstract Class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics Product
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.1; } // 10% discount
    public double calculateTax() { return getPrice() * 0.18; }     // 18% GST
    public String getTaxDetails() { return "18% GST applied"; }
}

// Clothing Product
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.2; } // 20% discount
    public double calculateTax() { return getPrice() * 0.05; }     // 5% VAT
    public String getTaxDetails() { return "5% VAT applied"; }
}

// Grocery Product
class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; } // 5% discount
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i+1));
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Type (1=Electronics, 2=Clothing, 3=Groceries): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                products.add(new Electronics(id, name, price));
            } else if (type == 2) {
                products.add(new Clothing(id, name, price));
            } else {
                products.add(new Groceries(id, name, price));
            }
        }

        System.out.println("\n---- Final Billing ----");
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("\nProduct: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: -" + discount);
            System.out.println("Tax: +" + tax);
            System.out.println("Final Price: " + finalPrice);

            if (p instanceof Taxable) {
                System.out.println(((Taxable)p).getTaxDetails());
            } else {
                System.out.println("No Tax Applied");
            }
        }
    }
}






