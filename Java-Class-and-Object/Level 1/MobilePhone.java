import java.util.Scanner;
public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        MobilePhone mp = new MobilePhone(brand, model, price);
        System.out.println();
        mp.display();
        sc.close();
    }
}
