import java.util.*;
public class Task {
	String name;
	int priority;
	int id;
	String description;
	String owner;
	
	
	
	public Task(String name, int priority, String description, String owner){
		this.name = name;
		this.priority = priority;
		this.description = description;
		this.owner = owner;
		id = Math.random() * 1000000;
	}
}
