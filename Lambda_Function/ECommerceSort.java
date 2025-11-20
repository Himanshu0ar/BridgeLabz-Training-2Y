import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " (₹" + price + ", Rating: " + rating + ", Discount: " + discount + "%)";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 25000, 4.5, 10),
            new Product("Laptop", 60000, 4.7, 15),
            new Product("Watch", 5000, 4.2, 5)
        );

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);
    }
}
