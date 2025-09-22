import java.util.ArrayList;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class Customer {
    String name;
    ArrayList<Product> cart;

    Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    void addProduct(Product p) {
        cart.add(p);
    }
}

class BillGenerator {
    double generateBill(Customer c) {
        double total = 0;
        for (Product p : c.cart) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStore{
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 3.0, 2)); // 2kg @ $3/kg
        customer.addProduct(new Product("Milk", 2.0, 1));   // 1L @ $2/L

        BillGenerator billGen = new BillGenerator();
        double totalBill = billGen.generateBill(customer);

        System.out.println("Customer: " + customer.name);
        for (Product p : customer.cart) {
            System.out.println(p.quantity + " x " + p.name + " @ " + p.price + " each = " + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
