interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting data to CSV file...");
    }

    public void exportToPDF() {
        System.out.println("Exporting data to PDF file...");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        ReportExporter report = new ReportExporter();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
