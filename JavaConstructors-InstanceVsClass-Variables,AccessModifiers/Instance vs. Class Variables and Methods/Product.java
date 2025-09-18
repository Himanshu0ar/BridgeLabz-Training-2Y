public class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalProducts = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    public void display() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void showTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 5);
        Product p2 = new Product("Phone", 20000, 10);
        p1.display();
        p2.display();
        Product.showTotalProducts();
    }
}
