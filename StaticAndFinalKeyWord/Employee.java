public class Employee {
    private static String companyName;
    private static int TotalEmployees = 0;

    // Instance variables
    String name;
    final int id;
    String designation;
    // Constructor to initialize name, id, and designation
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        TotalEmployees++;
    }
    // Static method to get the total number of employees
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name:" + name);
            System.out.println("ID:" + id);
            System.out.println("Designation:" + designation);
            System.out.println("Company Name:" + companyName);
            System.out.println("Total Employees:" + TotalEmployees);
        } else {
            System.out.println("This is not an Employee instance.");
        }
    }

    public static void main(String[] args) {
        companyName = "Tech Solutions";
        Employee emp1 = new Employee("Alice", 101, "Developer");
        emp1.displayDetails();

        Employee emp2 = new Employee("Bob", 102, "Manager");
        emp2.displayDetails();
    }
}