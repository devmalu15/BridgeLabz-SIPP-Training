import java.util.*;

class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getTitle());
        }
    }
}

class Professor {
    private String name;
    private int id;
    private List<Course> teachingCourses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.teachingCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setProfessor(this);
        }
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course c : teachingCourses) {
            System.out.println("- " + c.getTitle());
        }
    }
}

class Course {
    private String title;
    private int code;
    private Professor professor;
    private List<Student> students;

    public Course(String title, int code) {
        this.title = title;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("Course: " + title);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        Professor p1 = new Professor("Dr. Smith", 201);
        Professor p2 = new Professor("Dr. Johnson", 202);

        Course c1 = new Course("Data Structures", 301);
        Course c2 = new Course("Operating Systems", 302);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        c1.showDetails();
        c2.showDetails();
        s1.showCourses();
        s2.showCourses();
        p1.showCourses();
        p2.showCourses();
    }
}
