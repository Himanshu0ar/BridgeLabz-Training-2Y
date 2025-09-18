public class Course {
    private String courseName;
    private String instructor;
    private int enrolledStudents;
    private static int totalCourses = 0;

    public Course(String courseName, String instructor, int enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
        totalCourses++;
    }

    public void display() {
        System.out.println("Course: " + courseName + ", Instructor: " + instructor + ", Enrolled: " + enrolledStudents);
    }

    public static void showTotalCourses() {
        System.out.println("Total Courses: " + totalCourses);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", "Dr. Sharma", 50);
        Course c2 = new Course("Data Structures", "Prof. Mehta", 40);
        c1.display();
        c2.display();
        Course.showTotalCourses();
    }
}
