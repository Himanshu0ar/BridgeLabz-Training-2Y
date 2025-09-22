import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void enrollStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    int rollNo;
    ArrayList<Course> courses;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showSchool() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("- Student: " + s.name);
        }
    }
}

public class SchoolAssociation {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Aman", 101);
        Student s2 = new Student("Riya", 102);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        school.showSchool();
        System.out.println();

        s1.showCourses();
        s2.showCourses();

        System.out.println();
        c1.showStudents();
        c2.showStudents();
    }
}
