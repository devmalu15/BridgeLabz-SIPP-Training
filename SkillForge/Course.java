
public class Course {
	String name;
	int course_id;
	
	
	public Course(String name, int course_id) {
		this.name = name;
		this.course_id = course_id;
	}
	
	
	public String toString() {
		return name + " " + course_id;
	}

}
