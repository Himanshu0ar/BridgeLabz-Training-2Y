import java.util.Scanner;

public class SimpleInterest{
    public static double findsi(double p, double r, double t) {
        double simpleInterest = (p * r * t) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double SI = findsi(principal, rate, time);
        System.out.println("Simple Interest is: " + SI);

        sc.close();
    }
}
