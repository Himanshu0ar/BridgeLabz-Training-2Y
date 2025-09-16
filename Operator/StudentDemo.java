class Student {
    private static String universityName = "XYZ University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Roll: " + rollNumber +
                               ", Name: " + name + ", Grade: " + grade);
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", "A");
        Student s2 = new Student(2, "Sneha", "B");

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}
