import java.util.*;

// Abstract Class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String n, int a) {
        this.patientId = id;
        this.name = n;
        this.age = a;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient Class
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int days;
    private ArrayList<String> records = new ArrayList<>();

    public InPatient(int id, String n, int a, double rate, int d) {
        super(id, n, a);
        this.dailyRate = rate;
        this.days = d;
    }

    public double calculateBill() { return dailyRate * days; }
    public void addRecord(String r) { records.add(r); }
    public void viewRecords() { System.out.println("Records: " + records); }
}

// OutPatient Class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records = new ArrayList<>();

    public OutPatient(int id, String n, int a, double fee) {
        super(id, n, a);
        this.consultationFee = fee;
    }

    public double calculateBill() { return consultationFee; }
    public void addRecord(String r) { records.add(r); }
    public void viewRecords() { System.out.println("Records: " + records); }
}

// Main Class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Patient " + (i+1));
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Type (1=InPatient, 2=OutPatient): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                System.out.print("Enter Daily Rate: ");
                double rate = sc.nextDouble();
                System.out.print("Enter Number of Days: ");
                int days = sc.nextInt();
                sc.nextLine();

                InPatient ip = new InPatient(id, name, age, rate, days);

                System.out.print("Enter number of medical records: ");
                int recCount = sc.nextInt();
                sc.nextLine();
                for (int r = 0; r < recCount; r++) {
                    System.out.print("Enter record " + (r+1) + ": ");
                    ip.addRecord(sc.nextLine());
                }

                patients.add(ip);
            } else {
                System.out.print("Enter Consultation Fee: ");
                double fee = sc.nextDouble();
                sc.nextLine();

                OutPatient op = new OutPatient(id, name, age, fee);

                System.out.print("Enter number of medical records: ");
                int recCount = sc.nextInt();
                sc.nextLine();
                for (int r = 0; r < recCount; r++) {
                    System.out.print("Enter record " + (r+1) + ": ");
                    op.addRecord(sc.nextLine());
                }

                patients.add(op);
            }
        }

        System.out.println("\n---- Patient Details ----");
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            ((MedicalRecord)p).viewRecords();
            System.out.println("-----------------------------");
        }
    }
}
