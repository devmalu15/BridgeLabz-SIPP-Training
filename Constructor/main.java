package Constructor;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
// Getters and Setters
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

    // subclass
    class PostgraduateStudent extends Student {

        // Constructor
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }
// Overriding the displayDetails method
        public void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Postgraduate Student Name: " + name);
            System.out.println("CGPA: " + getCGPA());
        }
    }

    public class main {
        public static void main(String[] args) {
            PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 3.8);

            pgStudent.displayDetails();

            pgStudent.setCGPA(9.3);
            System.out.println("Updated CGPA: " + pgStudent.getCGPA());
        }
    }