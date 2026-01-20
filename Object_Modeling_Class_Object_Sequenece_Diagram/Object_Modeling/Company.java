import java.util.ArrayList;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void display() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void display() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }

    public void clearEmployees() {
        employees.clear(); // Simulates deleting employees
    }
}

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public Department createDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void displayStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
    }

    public void deleteCompany() {
        // Clear all departments and their employees
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("Company and all departments/employees have been deleted.");
    }

    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = company.createDepartment("Development");
        dev.addEmployee("Alice", "Software Engineer");
        dev.addEmployee("Bob", "Backend Developer");

        Department hr = company.createDepartment("Human Resources");
        hr.addEmployee("Carol", "HR Manager");

        company.displayStructure();

        // Deleting company (composition: all parts should be gone too)
        company.deleteCompany();
    }
}
