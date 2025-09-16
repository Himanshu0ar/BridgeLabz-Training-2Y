import java.util.Scanner;
public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }

    // standalone demo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee id (int): ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary (double): ");
        double salary = sc.nextDouble();
        Employee e = new Employee(name, id, salary);
        System.out.println();
        e.displayDetails();
        sc.close();
    }
}
