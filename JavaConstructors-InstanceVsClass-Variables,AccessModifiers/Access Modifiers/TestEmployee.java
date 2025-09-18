class Employee {
    private String name;
    protected String department;
    double salary;
    public int empId;

    public Employee(String name, String department, double salary, int empId) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    public Manager(String name, String department, double salary, int empId) {
        super(name, department, salary, empId);
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + empId);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", "IT", 80000, 201);
        m.showDetails();
    }
}
