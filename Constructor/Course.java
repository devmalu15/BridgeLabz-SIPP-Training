package Constructor;
public class Course {

    // Instance variables
    String CourseName;
    double duration;
    double fee;

    // class variable
    static String instituteName = "Howards";

    // constructor to initialize instance variables
    public Course(String CourseName, double duration, double fee) {
        this.CourseName = CourseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Method to display course details, Instance Method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration of the course: " + duration);
        System.out.println("Fee of the course: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Static method to update institute name
    public static void updateInstituteName(String UpdatedInstituteName) {
        instituteName = UpdatedInstituteName;

    }

    // instance method
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3.0, 300.0);
        c1.displayCourseDetails();

       
        // class method
        Course.updateInstituteName("Tech Academy");


         Course c2 = new Course("Python Programming", 4.0, 400.0);
        c2.displayCourseDetails();

    }

}