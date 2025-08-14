// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }
import java.util.Scanner;

public class ProblemsSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Welcome to Bridgelabz!
        System.out.println("Welcome to Bridgelabz!");

        // 2. Add Two Numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum = " + (num1 + num2));

        // 3. Celsius to Fahrenheit Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);

        // 4. Area of a Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double areaCircle = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + areaCircle);

        // 5. Volume of a Cylinder
        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();
        double volumeCylinder = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder = " + volumeCylinder);

        // Self Problems

        // 1. Calculate Simple Interest
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);

        // 2. Perimeter of a Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        double perimeterRectangle = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeterRectangle);

        // 3. Power Calculation
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println("Power = " + power);

        // 4. Calculate Average of Three Numbers
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        double average = (n1 + n2 + n3) / 3;
        System.out.println("Average = " + average);

        // 5. Convert Kilometers to Miles
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles = " + miles);

        sc.close();
    }
}
