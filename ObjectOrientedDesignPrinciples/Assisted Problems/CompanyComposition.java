import java.util.ArrayList;

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft Ltd.");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Rahul", 201));
        d1.addEmployee(new Employee("Sneha", 202));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Anjali", 301));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}
