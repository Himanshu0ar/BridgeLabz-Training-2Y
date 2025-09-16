import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public void display() {
        System.out.printf("Radius: %.4f%nArea: %.4f%nCircumference: %.4f%n", radius, area(), circumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println();
        c.display();
        sc.close();
    }
}
