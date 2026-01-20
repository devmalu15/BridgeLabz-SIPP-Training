import java.time.*;

public class Queue {
	Task first = null;
	Task temp = null;
	int cap;
	int limit;
	
	public Queue(int cap) {
		limit = cap;
	}
	public void push(Task task) {
		if(first == null) {
			first = task;
			temp = first;
			limit--;
		}
		else if(first.priority < task.priority) {
			task.next = first;
			first = task;
			limit--;
			temp = first;
		}
		else {
			temp = first;
			while(temp != null) {
				if(task.priority < temp.priority) {
					if(temp.next == null) {
						task.next = temp.next;
						temp.next = task;
						temp = first;
						limit--;
						break;
					}
					else if(task.priority >= temp.next.priority) {
						task.next = temp.next;
						temp.next = task;
						temp = first;
						limit--;
						break;
					}
					
					
				}
				temp = temp.next;
			}
			
			
			
		}
		
		
			
	}
	
	public void display() {
		temp = first;
		while(temp != null) {
			System.out.println( " " + temp.id + "    " + temp.name + "     " + temp.priority + "     " + temp.owner + "   " + temp.description + "         " + temp.duration);
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	
	public void displayQueue() {
		temp = first;
		while(temp != null) {
			System.out.print(temp.name + "|" + temp.priority + " <- ");
			temp = temp.next;
		}	
		System.out.println();
	}
	
	
	
	public void pop() {
		if(first == null) {
			System.out.println("Queue is empty!");
		}
		else {
			System.out.println("Task executed: " + first.name);
			first = first.next;
			limit++;
		}
	}
	
	public void timePop(int now) {
		if(first == null) {
			System.out.println("Queue is empty!");
		}
		else {
			System.out.println("                " + "Name" + "             " + "Execution Time");
			while(first != null) {
				LocalDateTime rn = LocalDateTime.now();
				int rightNow = (rn.getHour() * 60 * 60) + (rn.getMinute() * 60) + rn.getSecond();
				if((rightNow - now) == first.duration) {
					System.out.println("Task executed: " + first.name + "      " + rn);
					now = now + first.duration;
					first = first.next;
					limit++;
				}
				else {
					continue;
				}
			}
			
			System.out.println("All Tasks Executed!");
			
			
		}
	}


}
