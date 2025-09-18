public class Circle {
    private double radius;

    // Default constructor (calls parameterized)
    public Circle() {
        this(1.0); // default radius 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public double area() { return Math.PI * radius * radius; }
    public double circumference() { return 2 * Math.PI * radius; }

    public void display() {
        System.out.printf("Radius: %.2f, Area: %.2f, Circumference: %.2f%n",
                          radius, area(), circumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(); // default
        Circle c2 = new Circle(2.5);
        c1.display();
        c2.display();
    }
}
