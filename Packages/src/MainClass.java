import Packages.student.Student;
import Packages.faculty.Faculty;

public class MainClass {
    public static void main(String[] args){
        Student s = new Student("Himanshu Dubey", 101);
        Faculty f = new Faculty("Sameer Sir", "Java");

        s.displayStudent();
        System.out.println("---------------------");
        f.displayFaculty();

    }
}
