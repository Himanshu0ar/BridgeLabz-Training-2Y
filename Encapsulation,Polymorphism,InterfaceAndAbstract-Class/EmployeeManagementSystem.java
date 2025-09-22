import java.util.*;

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

// Interface
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Full-Time Employee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double allowance;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double allowance) {
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Base Salary: ");
            double baseSalary = sc.nextDouble();

            System.out.print("Is this FullTime (1) or PartTime (2)? ");
            int type = sc.nextInt();

            if (type == 1) {
                System.out.print("Enter Allowance: ");
                double allowance = sc.nextDouble();
                sc.nextLine();
                FullTimeEmployee fte = new FullTimeEmployee(id, name, baseSalary, allowance);
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                fte.assignDepartment(dept);
                employees.add(fte);
            } else {
                System.out.print("Enter Work Hours: ");
                int hours = sc.nextInt();
                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();
                sc.nextLine();
                PartTimeEmployee pte = new PartTimeEmployee(id, name, baseSalary, hours, rate);
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                pte.assignDepartment(dept);
                employees.add(pte);
            }
        }

        // Display all employee details
        System.out.println("\n---- Employee Details ----");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println("----------------------------");
            sc.close();
        }
    }
}
