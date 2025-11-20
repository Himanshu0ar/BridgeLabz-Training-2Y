import static java.lang.Math.*; 

public class StaticImportDemo {
    public static void main(String[] args) {

        double a = 25, b = 5, c = -10;

        System.out.println("Square root of " + a + ": " + sqrt(a));
        System.out.println(a + " raised to the power " + b + ": " + pow(a, b));
        System.out.println("Maximum of " + a + " and " + b + ": " + max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + min(a, b));
        System.out.println("Absolute value of " + c + ": " + abs(c));
    }
}
