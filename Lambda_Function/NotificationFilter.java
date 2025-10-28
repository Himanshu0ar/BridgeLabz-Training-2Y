import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Critical: Heart Rate", "Info: Appointment", "Urgent: Low Oxygen");

        Predicate<String> isCritical = alert -> alert.contains("Critical") || alert.contains("Urgent");

        alerts.stream()
              .filter(isCritical)
              .forEach(System.out::println);
    }
}
