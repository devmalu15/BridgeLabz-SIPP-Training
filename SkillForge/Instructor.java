
public class Instructor {
	String name;
	int instructor_id;
	int course_id;
	
	public Instructor(String name, int instructor_id, int course_id) {
		this.name = name;
		this.instructor_id = instructor_id;
		this.course_id = course_id;
	}
	
	
	public String toString() {
		return name + " " + instructor_id + " " + course_id;
	}

}
