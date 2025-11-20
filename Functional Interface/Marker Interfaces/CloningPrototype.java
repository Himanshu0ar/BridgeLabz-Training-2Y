class Product implements Cloneable {
    private String name;
    private double price;
    private String category;
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

class Order {
    private String orderId;
    private String customerName;
    
    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }
    
    public String toString() {
        return "Order{orderId='" + orderId + "', customerName='" + customerName + "'}";
    }
}

public class CloningPrototype {
    public static void cloneObject(Object obj) {
        if (obj instanceof Cloneable) {
            try {
                Object cloned = ((Product) obj).clone();
                System.out.println("Original: " + obj);
                System.out.println("Cloned: " + cloned);
                System.out.println("Clone successful for " + obj.getClass().getSimpleName());
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported for " + obj.getClass().getSimpleName());
            }
        } else {
            System.out.println("Cannot clone: " + obj.getClass().getSimpleName() + " is not cloneable");
        }
    }
    
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99, "Electronics");
        Order order = new Order("ORD001", "John Doe");
        
        cloneObject(product);
        cloneObject(order);
    }
}