import java.util.Scanner;
public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalCost(int qty) {
        return price * qty;
    }

    public void displayDetails(int qty) {
        System.out.println("Item Details:");
        System.out.println("Code : " + itemCode);
        System.out.println("Name : " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total cost: " + totalCost(qty));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item code: ");
        String code = sc.nextLine();
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        Item item = new Item(code, name, price);
        System.out.println();
        item.displayDetails(qty);
        sc.close();
    }
}
