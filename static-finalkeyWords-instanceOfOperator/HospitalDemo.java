class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", ID: " + patientID +
                               ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Karan", 45, "Fever");
        Patient p2 = new Patient(2, "Neha", 30, "Cold");

        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
