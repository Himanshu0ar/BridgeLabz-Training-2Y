import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtility {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default Format: " + today);
        System.out.println("DD-MM-YYYY: " + DateFormatUtility.formatDate(today, "dd-MM-yyyy"));
        System.out.println("MM/DD/YYYY: " + DateFormatUtility.formatDate(today, "MM/dd/yyyy"));
        System.out.println("Full Month Format: " + DateFormatUtility.formatDate(today, "MMMM dd, yyyy"));
    }
}
