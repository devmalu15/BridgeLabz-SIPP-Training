import java.util.*;
import java.time.*;
public class Task {
	String name;
	int priority;
	int id;
	String description;
	String owner;
	Task next;
	int duration;
	
	
	
	public Task(String name, int priority, String description, String owner){
		this.name = name;
		this.priority = priority;
		this.description = description;
		this.owner = owner;
		id = (int) (Math.random() * 1000000);
		this.next = next;
		duration = (int) (Math.random() * 5);
	}
}
