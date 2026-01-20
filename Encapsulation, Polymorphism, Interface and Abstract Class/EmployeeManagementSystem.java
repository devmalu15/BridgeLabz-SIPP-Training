import java.util.ArrayList;
abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // setters
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // abstract method
    public abstract double calculateSalary();

    // concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    private String departmentName;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // for full-time, salary is just baseSalary (could add bonuses if needed)
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);  // baseSalary 0 for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000);
        fte.assignDepartment("HR");

        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 300, 20);
        pte.assignDepartment("Support");

        employeeList.add(fte);
        employeeList.add(pte);

        // polymorphic processing
        for (Employee emp : employeeList) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());

            // cast to Department interface to get department details
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("----------------------------");
        }
    }
}
