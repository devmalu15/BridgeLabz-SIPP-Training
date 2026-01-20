
public interface IScheduler {
	public void addAdminTask(String name, int priority, String description);
	public void addNormalTask(String name, String description);
	public void displaySchedule();
	public void execute();
	public void displayMenu();
	public void displayScheduleQueue();
	public void randomTasks(int n);
	public String randomStringGenerator(int n);
	public void executeAll(int now);
	
}
