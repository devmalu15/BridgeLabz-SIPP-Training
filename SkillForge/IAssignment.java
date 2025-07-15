
public interface IAssignment {
	
	public void createStudent(String name, int student_id, int course_id, int instructor_id);
	public void createInstructor(String name, int instructor_id, int course_id);
	public void createCourse(String name, int course_id);
	
	public void displayCourses();
	public void displayStudents();
	public void displayInstructors();
	public void displayAll();
	
	public void displayMenu();
	
	public void assignStudent(int s_id, int c_id);
	public void assignInstructor(int i_id, int c_id);
	
	public void studentsByCourses();
	public void studentsByInstructors();
	

}
