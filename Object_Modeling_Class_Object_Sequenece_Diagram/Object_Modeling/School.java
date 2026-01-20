import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // two-way association
        }
    }

    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

public class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has the following students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public static void main(String[] args) {
        // Create School
        School school = new School("Greenwood High");

        // Create Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Aggregation: Add students to school
        school.addStudent(alice);
        school.addStudent(bob);

        // Association: Enroll students in courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);

        bob.enrollInCourse(science);

        // Display
        school.showStudents();
        alice.showCourses();
        bob.showCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
