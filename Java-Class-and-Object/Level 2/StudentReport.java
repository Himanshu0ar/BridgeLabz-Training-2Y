import java.util.Scanner;
public class StudentReport {
    private String name;
    private int rollNumber;
    private double marks; // assume marks out of 100

    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String grade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }

    public void display() {
        System.out.println("Student Report");
        System.out.println("Name      : " + name);
        System.out.println("Roll No.  : " + rollNumber);
        System.out.println("Marks     : " + marks);
        System.out.println("Grade     : " + grade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks (0-100): ");
        double marks = sc.nextDouble();
        StudentReport s = new StudentReport(name, roll, marks);
        System.out.println();
        s.display();
        sc.close();
    }
}
