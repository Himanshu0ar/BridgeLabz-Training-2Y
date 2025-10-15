// TemperatureAlertSystem.java

import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double threshold = 37.5; // e.g., 37.5°C (fever limit)

        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        System.out.print("Enter the current temperature (°C): ");
        double currentTemp = sc.nextDouble();

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("⚠️ Alert: Temperature too high! (" + currentTemp + "°C)");
        } else {
            System.out.println("✅ Temperature is normal. (" + currentTemp + "°C)");
        }

        sc.close();
    }
}
