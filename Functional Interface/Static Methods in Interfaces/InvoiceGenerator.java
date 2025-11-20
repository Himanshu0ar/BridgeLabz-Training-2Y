import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatToStandard(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    static String formatToUS(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    
    static String formatToEuropean(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        LocalDate invoiceDate = LocalDate.now();
        
        System.out.println("Invoice Date (Standard): " + DateFormatter.formatToStandard(invoiceDate));
        System.out.println("Invoice Date (US): " + DateFormatter.formatToUS(invoiceDate));
        System.out.println("Invoice Date (European): " + DateFormatter.formatToEuropean(invoiceDate));
    }
}