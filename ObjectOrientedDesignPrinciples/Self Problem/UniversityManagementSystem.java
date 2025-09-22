import java.util.ArrayList;

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        c.assignProfessor(this);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Sharma");
        Professor prof2 = new Professor("Dr. Mehta");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        Student s1 = new Student("Aman");
        Student s2 = new Student("Riya");

        prof1.assignCourse(c1);
        prof2.assignCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        System.out.println();
        c1.showCourseDetails();
        System.out.println();
        c2.showCourseDetails();
    }
}
