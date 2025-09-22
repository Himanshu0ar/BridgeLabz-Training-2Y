import java.util.ArrayList;

class Patient {
    String name;
    int patientId;
    ArrayList<Doctor> doctors;

    Patient(String name, int patientId) {
        this.name = name;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void showDoctors() {
        System.out.println("Patient " + name + " consulted with:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    int doctorId;
    ArrayList<Patient> patients;

    Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " consulted patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void showHospital() {
        System.out.println("Hospital: " + hospitalName);
    }
}

public class HospitalCommunication {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Sharma", 201);
        Doctor d2 = new Doctor("Verma", 202);

        Patient p1 = new Patient("Aman", 101);
        Patient p2 = new Patient("Riya", 102);

        hospital.showHospital();

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        d2.showPatients();

        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}
