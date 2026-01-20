public class Queue {
	Node first = null;
	Node temp = null;
	int cap;
	int limit;
	
	public Queue(int cap) {
		limit = cap;
	}
	
	
	public void push(int e) {
		Node node = new Node(e);
		
		if(first == null) {
			first = node;
			limit--;
			temp = first;
		}
		
		else {
			temp.next = node;
			temp = node;
		}
	}
	
	public void display() {
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	public void pop() {
		if(first == null) {
			System.out.println("Queue is empty!");
		}
		else {
			System.out.println("first element is : " + first.data);
			first = first.next;
			limit++;
		}
	}

}
