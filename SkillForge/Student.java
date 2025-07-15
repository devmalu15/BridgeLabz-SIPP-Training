
public class Student {
	public String name;
	int student_id;
	int course_id;
	int instructor_id;
	
	
	public Student(String name, int student_id, int course_id, int instructor_id) {
		this.name = name;
		this.student_id = student_id;
		this.course_id = course_id;
		this.instructor_id = instructor_id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	
	public int getInstructor_id() {
		return instructor_id;
	}
	
	public int getCourse_id() {
		return course_id;
	}
	
	public String toString() {
		return name + " " + student_id + " " + course_id + " " + instructor_id;
	}
}
