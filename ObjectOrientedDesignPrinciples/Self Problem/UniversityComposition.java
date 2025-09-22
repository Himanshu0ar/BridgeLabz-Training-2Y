import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<Department> departments;

    University(String uniName) {
        this.uniName = uniName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class UniversityComposition {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");

        uni.showUniversity();

        System.out.println("--- Independent Faculty (Aggregation) ---");
        f1.showFaculty();
        f2.showFaculty();
    }
}
