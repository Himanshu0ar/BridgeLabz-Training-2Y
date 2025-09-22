import java.util.ArrayList;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order ID: " + o.orderId);
    }

    void showOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer c1 = new Customer("Aman");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 20000);
        Product p3 = new Product("Headphones", 3000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        System.out.println();
        c1.showOrders();
    }
}
