import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String n, double p, int q) { itemName = n; price = p; quantity = q; }
    double total() { return price * quantity; }
}

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
        System.out.println("Added: " + name);
    }

    public void removeItem(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid index.");
            return;
        }
        CartItem removed = items.remove(index);
        System.out.println("Removed: " + removed.itemName);
    }

    public double totalCost() {
        double sum = 0;
        for (CartItem it : items) sum += it.total();
        return sum;
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (int i=0;i<items.size();i++) {
            CartItem it = items.get(i);
            System.out.printf("%d: %s x%d @ %.2f = %.2f%n", i, it.itemName, it.quantity, it.price, it.total());
        }
        System.out.printf("Total = %.2f%n", totalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        boolean running = true;
        while (running) {
            System.out.println("\n1-Add 2-Remove 3-Show 4-Total 5-Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    cart.addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Index to remove: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    cart.removeItem(idx);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.printf("Total cost: %.2f%n", cart.totalCost());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Goodbye.");
        sc.close();
    }
}
