import java.util.*;
import java.time.*;

public class Scheduler implements IScheduler{
	Queue schedule;
	int cap;
	
	
	public Scheduler(int cap) {
		this.cap = cap;
		this.schedule = new Queue(cap);
	}
	

	
	public void addAdminTask(String name, int priority, String description) {
		Task task = new Task(name, priority, description, "Admin");
		schedule.push(task);
	}
	public void addNormalTask(String name, String description) {
		int randomPriority = (int) (Math.random() * 10);
		Task task = new Task(name, randomPriority, description, "Normal User");
		schedule.push(task);
	}
	
	public void displaySchedule() {
		schedule.display();
	}
	
	
	public void execute() {
		schedule.pop();
	}
	
	public void displayScheduleQueue() {
		schedule.displayQueue();
	}
	
	public void randomTasks(int n) {
		for(int i = 0; i < n; i++) {
			String name = randomStringGenerator(7);
			String desc = randomStringGenerator(7);
			addNormalTask(name, desc);
		}
	}
	
	public String randomStringGenerator(int n) {
		String[] strArr = {"a", "b", "c", "d", "e",
				"f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o",
				"p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z"};
		int randomInt = 0;
		StringBuffer str = new StringBuffer(n);
		for(int i = 0; i < n; i++) {
			randomInt = (int) (Math.random() * 26);
			str = str.append(strArr[randomInt]);
		}
		String result = str.toString();
		return result;
		
	}
	
	
	public void executeAll(int now) {
		schedule.timePop(now);
		
	}
	
	
	
	
	 public void displayMenu() {
	        Scanner input = new Scanner(System.in);

	        int choice1 = -1;

	        while (choice1 != 2) {
	            System.out.println("Select User(1)\nTerminate Program(2)\nShow Tasks(3)\n"
	            		+ "Show Task Queue(4)\nExecute Task(5)\nGenerate Random Tasks(6)\n"
	            		+ "Execute All Tasks(7)");

	            try {
	                choice1 = input.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input! Please enter a valid number.");
	                input.next();
	                choice1 = -1;
	                continue;
	            }

	            switch (choice1) {
	                case 1:
	                    int choice2 = -1;
	                    while (choice2 != 3) {
	                        System.out.println("Admin(1)\nNormal User(2)\nBack(3)");

	                        try {
	                            choice2 = input.nextInt();
	                        } catch (InputMismatchException e) {
	                            System.out.println("Invalid input! Please enter a valid number.");
	                            input.next();
	                            choice2 = -1;
	                            continue;
	                        }

	                        switch (choice2) {
	                            case 1:
	                                System.out.println("Welcome, Admin!");
	                                System.out.println("Enter task name:");
	                                String adminTaskName = input.next();
	                                System.out.println("Enter task priority:");
	                                int adminTaskPriority = -1;
	                                try {
	                                    adminTaskPriority = input.nextInt();
	                                } catch (InputMismatchException e) {
	                                    System.out.println("Invalid priority! Please enter a number.");
	                                    input.next();
	                                    continue;
	                                }
	                                System.out.println("Enter task description:");
	                                String adminTaskDescription = input.next();

	                                addAdminTask(adminTaskName, adminTaskPriority, adminTaskDescription);
	                                break;
	                            case 2:
	                                System.out.println("Welcome, Normal User!");
	                                System.out.println("Enter task name:");
	                                String normalTaskName = input.next();
	                                System.out.println("Enter task description:");
	                                String normalTaskDescription = input.next();

	                                addNormalTask(normalTaskName, normalTaskDescription);
	                                break;
	                            case 3:
	                                System.out.println("Going back to the main menu...");
	                                break;
	                            default:
	                                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
	                                break;
	                        }
	                    }
	                    break;

	                case 2:
	                    System.out.println("Terminating program. Goodbye!");
	                    break;

	                case 3:
	                    System.out.println("Displaying all tasks:");
	                    System.out.println("   ID  " +  "     Name   " + " Priority  " + " Owner   " + "  Description  " + "Duration(s)");
	                    displaySchedule();
	                    break;
	                    
	                 
	                case 4:
	                    System.out.println("Displaying all tasks:");
	                   
	                    displayScheduleQueue();
	                    break;
	                    
	                case 5:
	                	execute();
	                	break;
	                case 6:
	                	System.out.println("Enter number of tasks to be generated:");
	                	int n = input.nextInt();
	                	randomTasks(n);
	                	break;
	                	
	                case 7:
	                	LocalDateTime time = LocalDateTime.now();
	                	int now = (time.getHour() * 60 * 60) + (time.getMinute() * 60) + time.getSecond();
	                	executeAll(now);
	                	break;

	                default:
	                    System.out.println("Invalid choice. Please enter 1, 2, 3, 4, 5 or 6.");
	                    break;
	            }
	        }
	        input.close();
	    }

}
