class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    private final int id;
    private String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id +
                               ", Name: " + name + ", Designation: " + designation);
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sam", "Manager");
        Employee e2 = new Employee(102, "Tina", "Developer");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
