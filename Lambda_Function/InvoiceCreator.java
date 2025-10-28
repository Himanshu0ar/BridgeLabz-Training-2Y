import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String id) { this.transactionId = id; }
    public String toString() { return "Invoice for Txn: " + transactionId; }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> txnIds = Arrays.asList("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = txnIds.stream()
                                       .map(Invoice::new)
                                       .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
