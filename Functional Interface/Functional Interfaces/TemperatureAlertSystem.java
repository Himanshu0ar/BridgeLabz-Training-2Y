import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double threshold = 35.0;
        
        Predicate<Double> temperatureAlert = temp -> temp > threshold;
        
        double currentTemp1 = 40.0;
        double currentTemp2 = 30.0;
        
        if (temperatureAlert.test(currentTemp1)) {
            System.out.println("ALERT: Temperature " + currentTemp1 + " is above threshold!");
        } else {
            System.out.println("Temperature " + currentTemp1 + " is normal");
        }
        
        if (temperatureAlert.test(currentTemp2)) {
            System.out.println("ALERT: Temperature " + currentTemp2 + " is above threshold!");
        } else {
            System.out.println("Temperature " + currentTemp2 + " is normal");
        }
    }
}