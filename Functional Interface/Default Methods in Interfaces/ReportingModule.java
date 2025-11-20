interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
        System.out.println("JSON export completed successfully");
    }
}

class SalesReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting sales report to CSV");
    }
    
    public void exportToPDF() {
        System.out.println("Exporting sales report to PDF");
    }
}

class InventoryReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting inventory report to CSV");
    }
    
    public void exportToPDF() {
        System.out.println("Exporting inventory report to PDF");
    }
    
    public void exportToJSON() {
        System.out.println("Exporting inventory report to JSON with custom formatting");
    }
}

public class ReportingModule {
    public static void main(String[] args) {
        DataExporter salesExporter = new SalesReportExporter();
        DataExporter inventoryExporter = new InventoryReportExporter();
        
        salesExporter.exportToCSV();
        salesExporter.exportToPDF();
        salesExporter.exportToJSON();
        
        inventoryExporter.exportToCSV();
        inventoryExporter.exportToPDF();
        inventoryExporter.exportToJSON();
    }
}