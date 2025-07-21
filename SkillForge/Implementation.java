import java.util.Scanner;

public class Implementation implements IAssignment{
	
	Student[] studentArr = new Student[100];
	
	int studentIndex = 0;
	Instructor[] instructorArr = new Instructor[10];
	
	int instructorIndex = 0;
	Course[] courseArr = new Course[10];
	
	int courseIndex = 0;
	
	
	
	public void createStudent(String name, int student_id, int course_id, int instructor_id) {
		Student student = new Student(name, student_id, course_id, instructor_id);
		studentArr[studentIndex] = student;
		studentIndex++;
		
	}
	public void createInstructor(String name, int instructor_id, int course_id) {
		Instructor instructor = new Instructor(name, instructor_id, course_id);
		instructorArr[instructorIndex] = instructor;
		instructorIndex++;
		
	}
	public void createCourse(String name, int course_id) {
		Course course = new Course(name, course_id);
		courseArr[courseIndex] = course;
		courseIndex++;
		
	}
	
	
	public void displayStudents() {
		System.out.println("Name, student_id, course_id, instructor_id");
		
		for(int i = 0; i < studentIndex; i++) {
			
			System.out.println(studentArr[i].toString());
		}
	}
	
	public void displayInstructors() {
		System.out.println("Name, instructor_id, course_id");
		for(int i = 0; i < instructorIndex; i++) {
			System.out.println(instructorArr[i].toString());
		}
	}
	
	public void displayCourses() {
		System.out.println("Name, course_id");
		for(int i = 0; i < courseIndex; i++) {
			System.out.println(courseArr[i].toString());
		}
	}
	
	public void displayAll() {
		System.out.println("Name, student_id, course_id, instructor_id");
		for(int i = 0; i < studentIndex; i++) {
			System.out.println(studentArr[i].toString());
		}
		
		System.out.println();
		System.out.println("Name, instructor_id, course_id");
		for(int i = 0; i < instructorIndex; i++) {
			System.out.println(instructorArr[i].toString());
		}
		
		System.out.println();
		System.out.println("Name, course_id");
		for(int i = 0; i < courseIndex; i++) {
			System.out.println(courseArr[i].toString());
		}
	}
	
	
	
	
	public void assignStudent(int s_id, int c_id) {
		for(int i = 0; i < studentIndex; i++) {
			if(studentArr[i].student_id == s_id) {
				studentArr[i].course_id = c_id;
				System.out.println(studentArr[i].name + " is assigned to course_id" + studentArr[i].course_id);
			}
		}
	}
	
	
	
	public void assignInstructor(int i_id, int c_id) {
		for(int i = 0; i < instructorIndex; i++) {
			if(instructorArr[i].instructor_id == i_id) {
				instructorArr[i].course_id = c_id;
				System.out.println(instructorArr[i].name + " is assigned to course_id" + instructorArr[i].course_id);
			}
		}
	}
	
	
	public void studentsByCourses() {
		for(int i = 0; i < courseIndex; i++) {
			System.out.println(courseArr[i].toString());
			for(int j = 0; j < studentIndex; j++) {
				if(courseArr[i].course_id == studentArr[j].course_id) {
					System.out.println(studentArr[j].toString());
				}
			}
			
			System.out.println();
		}
	}
	
	public void studentsByInstructors() {
		for(int i = 0; i < instructorIndex; i++) {
			System.out.println(instructorArr[i].toString());
			for(int j = 0; j < studentIndex; j++) {
				if(instructorArr[i].course_id == studentArr[j].course_id) {
					System.out.println(studentArr[j].toString());
				}
			}
			
			System.out.println();
		}
	}
	
	
	public void displayMenu() {
        Scanner input = new Scanner(System.in);
        int choice1 = 1;
        while(choice1 != 0) {
            System.out.println("View Menu(1)\nTerminate Program(0)");
            choice1 = input.nextInt();
            switch(choice1) {
                case 0:
                    break;

                case 1:
                    int choice2 = 0;
                    while(choice2 != 9) {
                        System.out.println("Add Student(1)   Add Instructor(2)   Add Course(3)\n"
                                + "Show Students(4)   Show Instructor(5)   Show Courses(6)\n"
                                + "Show Students By Courses(7)   Show Students By Instructors(8)\n"
                                + "back(9)");
                        choice2 = input.nextInt();
                        switch(choice2) {
                            case 1:
                                int choice3 = 0;
                                while(choice3 != 3) {
                                    System.out.println("Create New Student(1)\n"
                                            + "Assign Existing Students(2)\n"
                                            + "back(3)");
                                    choice3 = input.nextInt();
                                    switch(choice3) {
                                        case 1:
                                            System.out.println("Name:");
                                            String name = input.next();
                                            System.out.println("Student_id:");
                                            int student_id = input.nextInt();
                                            System.out.println("Course_id:");
                                            int course_id = input.nextInt();
                                            System.out.println("Instructor_id:");
                                            int instructor_id = input.nextInt();

                                            createStudent(name, student_id, course_id, instructor_id);
                                            break;

                                        case 2:
                                            int choice4 = 0;
                                            while(choice4 != 3) {
                                                System.out.println("Show Everything(1)\nAssign(2)\nBack(3)");
                                                choice4 = input.nextInt();
                                                switch(choice4) {
                                                    case 1:
                                                        displayAll();
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter Student id : ");
                                                        int stud_id = input.nextInt();
                                                        System.out.println("Enter Course id : ");
                                                        int crs_id = input.nextInt();

                                                        assignStudent(stud_id, crs_id);
                                                        break;
                                                    case 3:
                                                        break;
                                                }
                                            }
                                            break;

                                        case 3:
                                            break;
                                    }
                                }
                                break;


                            case 2:
                                int choice5 = 0;
                                while(choice5 != 3) {
                                    System.out.println("Create New Instructor(1)\n"
                                            + "Assign Existing Instructor(2)\n"
                                            + "back(3)");
                                    choice5 = input.nextInt();
                                    switch(choice5) {
                                        case 1:
                                            System.out.println("Name:");
                                            String nameI = input.next();
                                            System.out.println("Instructor_id:");
                                            int instructor_idI = input.nextInt();
                                            System.out.println("Course_id:");
                                            int course_idI = input.nextInt();

                                            createInstructor(nameI, instructor_idI, course_idI);
                                            break;

                                        case 2:
                                            int choice6 = 0;
                                            while(choice6 != 3) {
                                                System.out.println("Show Everything(1)\nAssign(2)\nBack(3)");
                                                choice6 = input.nextInt();
                                                switch(choice6) {
                                                    case 1:
                                                        displayAll();
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter Instructor id : ");
                                                        int intrcr_id = input.nextInt();
                                                        System.out.println("Enter Course id : ");
                                                        int crs_id = input.nextInt();

                                                        assignInstructor(intrcr_id, crs_id);
                                                        break;
                                                    case 3:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            break;
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("CourseName : ");
                                String nameC = input.next();
                                System.out.println("CourseId : ");
                                int course_idC = input.nextInt();
                                createCourse(nameC, course_idC);
                                break;
                            case 4:
                                displayStudents();
                                break;
                            case 5:
                                displayInstructors();
                                break;
                            case 6:
                                displayCourses();
                                break;
                            case 7:
                            	studentsByCourses();
                                break;
                            case 8:
                                // displayStudentsByInstructors();
                                break;
                            case 9:
                                break;
                        }
                    }
                    break;
            }
        }
        input.close();
    }
	
	
	
	
	

}
