import java.util.ArrayList;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    ArrayList<Subject> subjects;

    Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    void addSubject(Subject s) {
        subjects.add(s);
    }
}

class GradeCalculator {
    String calculateGrade(Student s) {
        int total = 0;
        for (Subject sub : s.subjects) {
            total += sub.marks;
        }
        double avg = total / (double) s.subjects.size();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        GradeCalculator calc = new GradeCalculator();
        String grade = calc.calculateGrade(student);

        System.out.println("Student: " + student.name);
        for (Subject s : student.subjects) {
            System.out.println("Subject: " + s.name + " Marks: " + s.marks);
        }
        System.out.println("Final Grade: " + grade);
    }
}
