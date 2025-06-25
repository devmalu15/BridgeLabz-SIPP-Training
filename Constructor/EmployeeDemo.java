package Constructor;
class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass
class Manager extends Employee {

    // Constructor
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Overriding displayDetails
    public void displayDetails() {
        System.out.println("Manager Details:");
        super.displayDetails();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("EMP001", "HR", 50000);
        employee.displayDetails();

        employee.setSalary(55000);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
